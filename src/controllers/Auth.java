package controllers;

import config.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Auth {

    Connection db = new database().connect();
    PreparedStatement stmt;
    ResultSet result;
    String query;

    public boolean authenticateUser(String inputUsername, String inputPassword) {
        query = "SELECT * FROM users WHERE username = ? AND password = ?";

        try {
            stmt = db.prepareStatement(query);

            stmt.setString(1, inputUsername);
            stmt.setString(2, inputPassword);

            result = stmt.executeQuery();

            return result.next();
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean registerUser(String username, String password) {
        String queryCheck = "SELECT * FROM users WHERE username = ?";
        String queryInsert = "INSERT INTO users (username,password,role_id) VALUES(?, ?, ?)";

        try {
            // Periksa apakah username sudah ada dalam database
            stmt = db.prepareStatement(queryCheck);
            stmt.setString(1, username);
            result = stmt.executeQuery();

            if (result.next()) {
                // Jika username sudah ada, tampilkan pesan kesalahan
                JOptionPane.showMessageDialog(null, "Username sudah digunakan. Silakan pilih username lain.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                // Jika username belum ada, lakukan proses pendaftaran
                stmt = db.prepareStatement(queryInsert);
                stmt.setString(1, username);
                stmt.setString(2, password); // Hash password sebelum disimpan
                stmt.setInt(3, 1); // Misalnya, level akses user

                stmt.executeUpdate();
                return true; // Berhasil mendaftar
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false; // Kesalahan saat eksekusi query
        }
    }
}
