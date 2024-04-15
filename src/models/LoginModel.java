package models;

import config.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel {

    static Connection db = new database().connect();

    public static ResultSet getUser(String inputUsername, String inputPassword) {
        String query = "SELECT * FROM users WHERE username = ? AND password = ?";

        try {
            PreparedStatement stat = db.prepareStatement(query);

            stat.setString(1, inputUsername);
            stat.setString(2, inputPassword);

            return stat.executeQuery();
        } catch (SQLException e) {
            return null;
        }
    }
}
