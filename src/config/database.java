package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {

    private Connection conn;

    public Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Koneksi Gagal, Error : " + ex.getMessage());
        }

        String url = "jdbc:mysql://localhost/javadesk_app";
        
        try {
            conn = DriverManager.getConnection(url, "ilhampopol", "cacadboy182");
        } catch (SQLException ex) {
            System.out.println("Gagal koneksi database, Error : " + ex.getMessage());
        }
        
        return conn;
    }
}
