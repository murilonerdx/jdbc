package org.example;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioMapperJdbcTemplate implements RowMapper<UsuarioDAO> {

    @Override
    public UsuarioDAO mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new UsuarioDAO(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("email")
        );
    }
}
