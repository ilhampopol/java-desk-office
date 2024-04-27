package controllers;

import config.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {

    Connection db = new database().connect();
    String query;
    PreparedStatement stmt;

    public boolean authenticateUser(String inputUsername, String inputPassword) {
        query = "SELECT * FROM users WHERE username = ? AND password = ?";
        
        try {
            stmt = db.prepareStatement(query);
            stmt.setString(1, inputUsername);
            stmt.setString(2, inputPassword);
            ResultSet resultSet = stmt.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            return false;
        }
    }
}
