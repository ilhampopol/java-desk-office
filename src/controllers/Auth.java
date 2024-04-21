package controllers;

import config.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Auth {

    static Connection db = new database().connect();
    String query;

    public boolean authenticateUser(String inputUsername, String inputPassword) {
        query = "SELECT * FROM users WHERE username = ? AND password = ?";

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

    public boolean registerUser(String username, String password) {
        String queryCheck = "SELECT * FROM users WHERE username = ?";
        String queryInsert = "INSERT INTO users (username,password,role_id) VALUES(?, ?, ?)";

        try {
            // Periksa apakah username sudah ada dalam database
            PreparedStatement checkStmt = db.prepareStatement(queryCheck);
            checkStmt.setString(1, username);
            ResultSet resultSet = checkStmt.executeQuery();

            if (resultSet.next()) {
                // Jika username sudah ada, tampilkan pesan kesalahan
                JOptionPane.showMessageDialog(null, "Username sudah digunakan. Silakan pilih username lain.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                // Jika username belum ada, lakukan proses pendaftaran
                PreparedStatement insertStmt = db.prepareStatement(queryInsert);
                insertStmt.setString(1, username);
                insertStmt.setString(2, password); // Hash password sebelum disimpan
                insertStmt.setInt(3, 1); // Misalnya, level akses user

                insertStmt.executeUpdate();
                return true; // Berhasil mendaftar
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false; // Kesalahan saat eksekusi query
        }
    }
}
