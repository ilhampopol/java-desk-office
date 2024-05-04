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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Core {

    // koneksi database
    Connection db = new database().connect();
    PreparedStatement stmt;
    ResultSet result;
    StringBuilder queryBuilder;

    public void dataTable(Object[] columnNames, Object[] column, DefaultTableModel tableModel, JTable table, String query) {
        tableModel.setColumnIdentifiers(columnNames); // Set kolom tabel dengan nama kolom yang diberikan
        table.setModel(tableModel);

        try {
            stmt = db.prepareStatement(query);
            result = stmt.executeQuery();
            
            tableModel.setRowCount(0);

            while (result.next()) {
                String[] rowData = new String[column.length];
                for (int i = 0; i < column.length; i++) {
                    rowData[i] = result.getString(column[i].toString()); // Ambil data dari setiap kolom
                }
                tableModel.addRow(rowData); // Tambahkan baris dengan data yang diambil
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal memuat tabel", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }

    // Method untuk mengisi combo box dengan hasil query yang sudah ditentukan
    public void populateComboBox(JComboBox comboBox, String query) {
        // Hapus item yang ada sebelumnya di JComboBox
        comboBox.removeAllItems();

        // Buat map untuk menyimpan pasangan ID dan nama jabatan
        Map<String, String> occupationMap = new HashMap<>();

        try {
            // Eksekusi query untuk mendapatkan data dari database
            stmt = db.prepareStatement(query);
            result = stmt.executeQuery();

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
            JOptionPane.showMessageDialog(null, "Gagal memuat data Combo Box", "Error", JOptionPane.ERROR_MESSAGE);
            
            System.out.print(e.getMessage());
        }

        // Set properti client property untuk menyimpan map occupation di ComboBox
        comboBox.putClientProperty("occupationMap", occupationMap);
    }

    // Method untuk menambahkan placeholder pada JTextField
    public void addPlaceholder(JTextField textField, String placeholder) {
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

    public void removePlaceholder(JTextField field) {
        field.setForeground(Color.BLACK); // Kembalikan warna teks ke warna default
        field.setFont(field.getFont().deriveFont(Font.PLAIN)); // Kembalikan gaya font ke normal
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

    public String lastID(String table) {
        String query = "SELECT id FROM " + table + " ORDER BY id DESC LIMIT 1";
        int intID;
        String lastID = "";

        try {
            stmt = db.prepareStatement(query);
            result = stmt.executeQuery();

            if (result.next()) {
                intID = result.getInt("id");
                intID += 1;
                lastID = String.valueOf(intID); // Mengonversi intID menjadi string
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal memuat data ID", "Error", JOptionPane.ERROR_MESSAGE);
            
            System.out.print(e.getMessage());
        }

        return lastID;
    }

    public boolean addEntity(String table, String[] values) {
        // Buat query SQL
        queryBuilder = new StringBuilder("INSERT INTO ");
        queryBuilder.append(table).append(" VALUES (");

        for (int i = 0; i < values.length; i++) {
            queryBuilder.append("?");
            if (i < values.length - 1) {
                queryBuilder.append(",");
            }
        }

        queryBuilder.append(")");

        // Eksekusi query
        try {
            stmt = db.prepareStatement(queryBuilder.toString());

            // Set nilai parameter
            for (int i = 0; i < values.length; i++) {
                stmt.setString(i + 1, values[i]);
            }

            // Eksekusi query
            stmt.executeUpdate();

            return true; // Berhasil memasukkan data
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());

            return false; // Gagal memasukkan data
        }
    }

    public boolean updateEntity(String table, String[] columns, String[] values, String condition) {
        // Buat query SQL
        queryBuilder = new StringBuilder("UPDATE ");
        queryBuilder.append(table).append(" SET ");

        for (int i = 0; i < columns.length; i++) {
            queryBuilder.append(columns[i]).append(" = ?");
            if (i < columns.length - 1) {
                queryBuilder.append(",");
            }
        }

        if (condition != null && !condition.isEmpty()) {
            queryBuilder.append(" WHERE ").append(condition);
        }

        // Eksekusi query
        try {
            stmt = db.prepareStatement(queryBuilder.toString());

            // Set nilai parameter
            for (int i = 0; i < values.length; i++) {
                stmt.setString(i + 1, values[i]);
            }

            // Eksekusi query
            stmt.executeUpdate();

            return true; // Berhasil memperbarui data
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());

            return false; // Gagal memperbarui data
        }
    }
}
