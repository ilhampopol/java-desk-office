package controllers;

import config.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Employee {

    static Connection db = new database().connect();

    public List<String[]> getAllEmployee() {
        List<String[]> employees = new ArrayList<>();
        String query = "SELECT id, name, address, phone_number, gender, occupation, department, branch FROM employee";

        try {
            PreparedStatement stmt = db.prepareStatement(query);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                String[] employeeData = new String[8];
                employeeData[0] = resultSet.getString("id");
                employeeData[1] = resultSet.getString("name");
                employeeData[2] = resultSet.getString("address");
                employeeData[3] = resultSet.getString("phone_number");
                employeeData[4] = resultSet.getString("gender");
                employeeData[5] = resultSet.getString("occupation");
                employeeData[6] = resultSet.getString("department");
                employeeData[7] = resultSet.getString("branch");

                employees.add(employeeData);
            }
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return employees;
    }

    public boolean addEmployee(String name, String address, String phoneNumber, String gender, String occupation, String department, String branch) {
        String query = "INSERT INTO employee (name, address, phone_number, gender, occupation, department, branch) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = db.prepareStatement(query);

            stmt.setString(1, name);
            stmt.setString(2, address);
            stmt.setString(3, phoneNumber);
            stmt.setString(4, gender);
            stmt.setString(5, occupation);
            stmt.setString(6, department);
            stmt.setString(7, branch);

            stmt.executeUpdate();

            return true;
        } catch (SQLException e) {
            System.out.print(e.getMessage());
            return false;
        }
    }
    
    public boolean updateEmployee(int id, String name, String address, String phoneNumber, String gender, String occupation, String department, String branch) {
        String query = "UPDATE employee SET name = ?, address = ?, phone_number = ?, gender = ?, occupation = ?, department = ?, branch = ? WHERE id =" + id;
        
        try {
            PreparedStatement stmt = db.prepareStatement(query);
            
            stmt.setString(1, name);
            stmt.setString(2, address);
            stmt.setString(3, phoneNumber);
            stmt.setString(4, gender);
            stmt.setString(5, occupation);
            stmt.setString(6, department);
            stmt.setString(7, branch);
            
            stmt.executeUpdate();
            
            return true;
        } catch (SQLException e) {
            System.out.print(e.getMessage());
            return false;
        }
    }
    
    public boolean deleteEmployee(int id) {
        String query = "DELETE FROM employee WHERE id = " + id;
        
        try {
            PreparedStatement stmt = db.prepareStatement(query);

            stmt.executeUpdate();
            
            return true;
        } catch (SQLException e) {
            System.out.print(e.getMessage());
            return false;
        }
    }
}
