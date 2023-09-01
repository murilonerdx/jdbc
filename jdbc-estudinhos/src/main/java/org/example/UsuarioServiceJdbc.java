package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceJdbc {

    private final JdbcConnectionSingleton singleton;

    public UsuarioServiceJdbc(JdbcConnectionSingleton singleton) {
        this.singleton = singleton;
    }

    public List<UsuarioDAO> buscarTodos() throws Exception {
        List<UsuarioDAO> usuarios = new ArrayList<>();
        ResultSet resultSet = singleton
                .connection()
                .prepareStatement("SELECT * FROM usuarios")
                .executeQuery();


        while(resultSet.next()){
            usuarios.add(new UsuarioDAO(resultSet.getInt("id"), resultSet.getString("nome"), resultSet.getString("email")));
        }

        return usuarios;
    }
}
