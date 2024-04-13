package Controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordHashing {

    public static String hashPassword(String password) {
        try {
            // Buat instance MessageDigest dengan algoritma SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Ubah password menjadi byte array
            byte[] hash = digest.digest(password.getBytes());

            // Konversi byte array menjadi representasi hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            // Handle jika algoritma hashing tidak ditemukan
            return null;
        }
    }

    public static void main(String[] args) {
        String password = "kintil";
        String hashedPassword = hashPassword(password);
        System.out.println("Hashed password: " + hashedPassword);
    }
}
