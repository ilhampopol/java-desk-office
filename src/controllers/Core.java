package controllers;

import config.database;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
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
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Core {

    // koneksi database
    Connection db = new database().connect();
    PreparedStatement stmt;
    ResultSet result;
    String query;
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
        query = "SELECT id FROM " + table + " ORDER BY id DESC LIMIT 1";
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

    public String lastIdByDate(String table, String date) {
        query = "SELECT id FROM " + table + " WHERE id LIKE '%" + date + "%'" + " ORDER BY id DESC LIMIT 1";
        String id, constantPart, numericPart, newNumericPart, newID = "";

        try {
            stmt = db.prepareStatement(query);
            result = stmt.executeQuery();

            if (result.next()) {
                id = result.getString("id");

                // Bagian konstan
                constantPart = id.substring(1, id.length() - 3);

                // Bagian angka yang ingin ditambahkan
                numericPart = id.substring(id.length() - 3);

                // Mengubah string menjadi integer
                int numericValue = Integer.parseInt(numericPart);

                // Menambahkan 1
                numericValue++;

                // Format angka dengan panjang tetap 3 digit dan tambahkan 0 jika perlu
                newNumericPart = String.format("%03d", numericValue);

                // Gabungkan kembali dengan bagian konstan
                newID = constantPart + newNumericPart;
            } else {
                newID = date + "001";
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal memuat data ID", "Error", JOptionPane.ERROR_MESSAGE);

            System.out.print(e.getMessage());
        }

        return newID;
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

    public boolean deleteEntity(String table, String id) {
        query = "DELETE FROM " + table + " WHERE id = ?";

        try {
            stmt = db.prepareStatement(query);
            // Set parameter
            stmt.setString(1, id);

            // Jalankan query
            int rowsAffected = stmt.executeUpdate();

            // Periksa apakah baris telah dihapus
            return rowsAffected > 0;
        } catch (SQLException e) {
            // Tangani error dengan menampilkan pesan kesalahan
            System.out.println("Gagal menghapus data: " + e.getMessage());
            return false;
        }
    }

    public void search(String id, Object[] columnNames, Object[] column, DefaultTableModel tableModel, JTable table, String query) {
        query += "AND e.id LIKE '%" + id + "%'";

        dataTable(columnNames, column, tableModel, table, query);
    }

    public void searchByDate(Object[] param, Object[] columnNames, Object[] column, DefaultTableModel tableModel, JTable table, String query) {
        String id = param[0].toString();
        String date1 = param[1].toString();
        String date2 = param[2].toString();

        if (id.isBlank()) {
            query = "SELECT a.date, a.employee_id, e.name AS name, a.in, a.out "
                    + "FROM attendance AS a "
                    + "JOIN employee AS e "
                    + "ON a.employee_id = e.id "
                    + "WHERE a.date BETWEEN '" + date1 + "' AND '" + date2 + "' "
                    + "ORDER BY a.date";
        } else {
            query = "SELECT a.date, a.employee_id, e.name AS name, a.in, a.out "
                    + "FROM attendance AS a "
                    + "JOIN employee AS e "
                    + "ON a.employee_id = e.id "
                    + "WHERE a.date BETWEEN '" + date1 + "' AND '" + date2 + "' AND e.id LIKE '%" + id + "%' "
                    + "ORDER BY a.date";
        }

        dataTable(columnNames, column, tableModel, table, query);
    }

    public boolean checkClockIn(String employee_id, String date) {
        query = "SELECT employee_id FROM attendance WHERE employee_id = '" + employee_id + "' AND date = '" + date + "'";

        try {
            stmt = db.prepareStatement(query);
            result = stmt.executeQuery();

            if (result.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean checkClockOut(String employee_id, String date) {
        query = "SELECT employee_id FROM attendance WHERE attendance.out = '-' AND employee_id = '" + employee_id + "' AND date = '" + date + "'";

        try {
            stmt = db.prepareStatement(query);
            result = stmt.executeQuery();

            if (result.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean updateBranch(String id, int values) {
        query = "UPDATE employee SET branch_id = " + values + " WHERE id = '" + id + "'";

        try {
            stmt = db.prepareStatement(query);
            stmt.executeUpdate();

            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void printReport(String file_name) {
        try {
            HashMap<String, Object> parameters = new HashMap<>();
            File report_file = new File(file_name);
            JasperReport jasper_report = (JasperReport) JRLoader.loadObject(report_file.getPath());
            JasperPrint jasper_print = JasperFillManager.fillReport(jasper_report, parameters, db);

            JasperViewer.viewReport(jasper_print, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void printReportByID(Object[] data) {
        try {
            HashMap<String, Object> parameters = new HashMap<>();
            String file_name = data[0].toString();
            parameters.put("id", data[1]);
            
            // Memeriksa panjang array untuk memastikan date1 dan date2 ada
            if (data.length > 2) {
                parameters.put("date1", data[2]);
            } else {
                // Menangani kasus ketika date1 tidak ada
                parameters.put("date1", null); // atau gunakan nilai default yang sesuai
            }

            if (data.length > 3) {
                parameters.put("date2", data[3]);
            } else {
                // Menangani kasus ketika date2 tidak ada
                parameters.put("date2", null); // atau gunakan nilai default yang sesuai
            }
            
            File report_file = new File(file_name);
            JasperReport jasper_report = (JasperReport) JRLoader.loadObject(report_file.getPath());
            JasperPrint jasper_print = JasperFillManager.fillReport(jasper_report, parameters, db);

            JasperViewer.viewReport(jasper_print, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
