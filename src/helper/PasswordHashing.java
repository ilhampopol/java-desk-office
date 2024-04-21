package helper;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordHashing {

    public static String hashPassword(String password) {
        try {
            // Buat instance dari MessageDigest dengan algoritma SHA-256
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            // Update message digest dengan input password
            md.update(password.getBytes());
            // Dapatkan hasil dari message digest
            byte[] byteData = md.digest();

            // Konversi byte ke bentuk hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte b : byteData) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }
}
