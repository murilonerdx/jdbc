package org.example;

import java.util.List;

/**
 * Hello world!
 *
 */

public class App
{

    public static void main( String[] args ) throws Exception {
        final JdbcConnectionSingleton singleton = new JdbcConnectionSingleton();
        UsuarioServiceJdbc jdbc = new UsuarioServiceJdbc(singleton);
        System.out.println(jdbc.buscarTodos());


        UsuarioServiceJdbcTemplate usuarioServiceJdbcTemplate = new UsuarioServiceJdbcTemplate();
        UsuarioDAO murilo = usuarioServiceJdbcTemplate.insert(new UsuarioDAO(null, "murilo", "mu-silva@outlook.com"));
        List<UsuarioDAO> select = usuarioServiceJdbcTemplate.select();
        System.out.println(murilo);
        System.out.println(select);
    }
}
