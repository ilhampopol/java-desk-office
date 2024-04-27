package helper;

public class InputValidator {

    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Contoh validasi nomor telepon: harus terdiri dari 12 digit dan hanya angka
        return phoneNumber.matches("\\d{12}");
    }

    public static boolean isValidUsername(String username) {
        // Contoh validasi username: harus terdiri dari minimal 5 karakter, hanya huruf dan angka, tanpa spasi
        return username.matches("[a-zA-Z0-9]{5,}");
    }

    public static boolean isValidPassword(String password) {
        // Contoh validasi password: harus terdiri dari minimal 8 karakter, minimal satu huruf besar, satu huruf kecil, dan satu angka
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$");
    }

    public boolean isValidInput(String... inputs) {
        for (String input : inputs) {
            if (!input.matches("^[a-zA-Z]*$")) {
                return false; // Jika salah satu input tidak memenuhi kondisi, kembalikan false
            }
        }
        return true; // Jika semua input memenuhi kondisi, kembalikan true
    }
}
