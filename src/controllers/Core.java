package controllers;

import config.database;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Core {
    
    // koneksi database
    static Connection db = new database().connect();
    
    // Method untuk mengisi combo box dengan hasil query yang sudah ditentukan
    public void populateComboBox(JComboBox comboBox, String query) {
        // Hapus item yang ada sebelumnya di JComboBox
        comboBox.removeAllItems();
        
        // Buat map untuk menyimpan pasangan ID dan nama jabatan
        Map<String, String> occupationMap = new HashMap<>();

        try {
            // Eksekusi query untuk mendapatkan data dari database
            PreparedStatement stmt = db.prepareStatement(query);
            ResultSet result = stmt.executeQuery();

            // Tambahkan hasil query ke JComboBox
            while (result.next()) {
                String id = result.getString("id");
                String name = result.getString("name");
                occupationMap.put(id, name); // Menyimpan pasangan ID dan nama jabatan
                comboBox.addItem(name); // Menambahkan nama jabatan ke ComboBox
            }

            // Tutup statement dan resultSet
            stmt.close();
            result.close();
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
        
        // Set properti client property untuk menyimpan map occupation di ComboBox
        comboBox.putClientProperty("occupationMap", occupationMap);
    }
    
    // Method untuk menambahkan placeholder pada JTextField
    public static void addPlaceholder(JTextField textField, String placeholder) {
        // Atur teks default jika JTextField tidak berfokus dan tidak memiliki input
        textField.setText(placeholder);
        textField.setForeground(Color.GRAY); // Atur warna teks placeholder
        textField.setFont(textField.getFont().deriveFont(Font.ITALIC)); // Atur gaya font menjadi italic

        // Tambahkan focus listener untuk menghapus placeholder saat JTextField mendapat fokus
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK); // Kembalikan warna teks ke warna default
                    textField.setFont(textField.getFont().deriveFont(Font.PLAIN)); // Kembalikan gaya font ke normal
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText(placeholder);
                    textField.setForeground(Color.GRAY); // Atur warna teks kembali menjadi warna placeholder
                    textField.setFont(textField.getFont().deriveFont(Font.ITALIC)); // Atur gaya font menjadi italic
                }
            }
        });
    }
    
    // mengosongkan inputan Text
    public void emptyInput(JTextField... fields) {
        for (JTextField field : fields) {
            field.setText("");
        }
    }

    // mengosongkan inputan Text Area
    public void emptyInputArea(JTextArea... fields) {
        for (JTextArea field : fields) {
            field.setText("");
        }
    }

    // mengosongkan inputan Combo
    public void emptyCombo(JComboBox... fields) {
        for (JComboBox field : fields) {
            field.setSelectedIndex(0);
        }
    }
}
