package controllers;

import config.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {

    static Connection db = new database().connect();

    public boolean authenticateUser(String inputUsername, String inputPassword) {
        String query = "SELECT * FROM users WHERE username = ? AND password = ?";
        
        try {
            PreparedStatement stat = db.prepareStatement(query);
            stat.setString(1, inputUsername);
            stat.setString(2, inputPassword);
            ResultSet resultSet = stat.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            return false;
        }
    }
}
