package helper;

public class InputValidator {

    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Contoh validasi nomor telepon: harus terdiri dari 10 digit dan hanya angka
        return phoneNumber.matches("\\d{10}");
    }

    public static boolean isValidEmail(String email) {
        // Contoh validasi email menggunakan ekspresi reguler
        return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }

    public static boolean isValidAge(int age) {
        // Contoh validasi usia: harus dalam rentang 18-65 tahun
        return age >= 18 && age <= 65;
    }
}
