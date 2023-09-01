package org.example;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;

@Component
public class JdbcConnectionSingleton  {

    String url = "jdbc:mysql://localhost:3306/exemplo";
    String username = "root";
    String password = "123456789";

    public JdbcConnectionSingleton() {
    }

    private Connection connection = null;

    public Connection connection() throws Exception {

        try {
            connection = DriverManager.getConnection(url, username, password);
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            connection.close();
            return null;
        }
    }
}
