package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class UsuarioServiceJdbcTemplate {

    private JdbcTemplate jdbcTemplate;

    private DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/exemplo");
        dataSource.setUsername("root");
        dataSource.setPassword("123456789");

        return dataSource;
    }

    private JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    public UsuarioServiceJdbcTemplate() {
        this.jdbcTemplate = new JdbcTemplate(dataSource());
    }

    public List<UsuarioDAO> select() {
        String sql = "SELECT * FROM usuarios";
        return jdbcTemplate.query(sql, new UsuarioMapperJdbcTemplate());
    }

    public UsuarioDAO insert(UsuarioDAO usuarioDAO) {
        String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";
        int id = jdbcTemplate.update(sql, usuarioDAO.getNome(), usuarioDAO.getEmail());
        return findById(id);
    }

    public UsuarioDAO findById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM usuarios WHERE  id = ?", new Object[]{id}, new UsuarioMapperJdbcTemplate());
    }

}

