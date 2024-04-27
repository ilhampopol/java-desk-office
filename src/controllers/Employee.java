package controllers;

import config.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Employee {

    Connection db = new database().connect();
    PreparedStatement stmt;
    ResultSet result;

    public List<String[]> getAllEmployee() {
        List<String[]> employees = new ArrayList<>();
        String query = "SELECT e.id,e.name,address,phone_number,gender,o.name AS occupation,d.name AS department,b.name AS branch,status FROM employee AS e JOIN occupation AS o ON e.occ_id = o.id JOIN department AS d ON e.dept_id = d.id JOIN branch as b ON e.branch_id = b.id WHERE status = 'AKTIF'";

        try {
            stmt = db.prepareStatement(query);
            result = stmt.executeQuery();

            while (result.next()) {
                String[] employeeData = new String[9];
                employeeData[0] = result.getString("id");
                employeeData[1] = result.getString("name");
                employeeData[2] = result.getString("address");
                employeeData[3] = result.getString("phone_number");
                employeeData[4] = result.getString("gender");
                employeeData[5] = result.getString("occupation");
                employeeData[6] = result.getString("department");
                employeeData[7] = result.getString("branch");
                employeeData[8] = result.getString("status");

                employees.add(employeeData);
            }
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return employees;
    }

    public String lastEmployeeID() {
        String query = "SELECT id FROM employee ORDER BY id DESC LIMIT 1";

        try {
            stmt = db.prepareStatement(query);
            result = stmt.executeQuery();

            // Mengambil tanggal saat ini
            LocalDate currentDate = LocalDate.now();

            // Membuat formatter untuk format yang diinginkan
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

            // Mengonversi tanggal menjadi string dengan format yang diinginkan
            String formattedDate = currentDate.format(formatter);

            // Cek apakah ada data yang ditemukan
            if (result.next()) {
                // Ambil 3 angka terakhir dari ID
            String lastID = result.getString("id").substring(Math.max(0, result.getString("id").length() - 3));

            // Konversi menjadi integer, tambahkan 1, dan format kembali ke string dengan 3 digit
            int nextID = Integer.parseInt(lastID) + 1;
            String formattedNextID = String.format("%03d", nextID);

            // Gabungkan dengan tanggal dan kembalikan
            return formattedDate + formattedNextID;
            } else {
                // Jika tidak ada, kembalikan nilai "001"
                return formattedDate + "001";
            }
        } catch (SQLException e) {
            System.out.print(e.getMessage());
            return null;
        }
    }

    public boolean addEmployee(String id, String name, String address, String phoneNumber, String gender, int occupation, int department, int branch) {
        String query = "INSERT INTO employee VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            stmt = db.prepareStatement(query);

            stmt.setString(1, id);
            stmt.setString(2, name);
            stmt.setString(3, address);
            stmt.setString(4, phoneNumber);
            stmt.setString(5, gender);
            stmt.setInt(6, occupation);
            stmt.setInt(7, department);
            stmt.setInt(8, branch);
            stmt.setString(9, "AKTIF");

            stmt.executeUpdate();

            return true;
        } catch (SQLException e) {
            System.out.print(e.getMessage());
            return false;
        }
    }

    public boolean updateEmployee(String id, String name, String address, String phoneNumber, String gender, int occupation, int department, int branch) {
        String query = "UPDATE employee SET name = ?, address = ?, phone_number = ?, gender = ?, occ_id = ?, dept_id = ?, branch_id = ? WHERE id =" + id;

        try {
            stmt = db.prepareStatement(query);

            stmt.setString(1, name);
            stmt.setString(2, address);
            stmt.setString(3, phoneNumber);
            stmt.setString(4, gender);
            stmt.setInt(5, occupation);
            stmt.setInt(6, department);
            stmt.setInt(7, branch);

            stmt.executeUpdate();

            return true;
        } catch (SQLException e) {
            System.out.print(e.getMessage());
            return false;
        }
    }

    public boolean deactivateEmployee(String id) {
        String query = "UPDATE employee SET status = 'NON-AKTIF' WHERE id = " + id;

        try {
            stmt = db.prepareStatement(query);

            stmt.executeUpdate();

            return true;
        } catch (SQLException e) {
            System.out.print(e.getMessage());
            return false;
        }
    }

}
