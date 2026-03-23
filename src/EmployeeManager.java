/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvien;


/**
 *
 * @author admin
 */
import java.util.ArrayList;
import java.text.NumberFormat;
import java.util.Locale;
public class EmployeeManager {
    private ArrayList<Employee> list;

    private String formatVND(double amount) {
        NumberFormat formatter = NumberFormat.getInstance(new Locale("vi", "VN"));
        return formatter.format(amount) + " ₫";
    }

    public EmployeeManager() {
        this.list = new ArrayList<>();
    }

    public ArrayList<Employee> getList() {
        return this.list;
    }

    // Add Employee
    public void addEmployee(Employee e) {
        if (findById(e.getId()) != null) {
            System.out.println("ID already exists!");
            return;
        }
        this.list.add(e);
        System.out.println("Employee added successfully!");
    }

    // Delete Employee
    public void deleteEmployee(String id) {
        Employee e = findById(id);
        if (e == null) {
            System.out.println("Employee not found!");
            return;
        }
        this.list.remove(e);
        System.out.println("Employee deleted successfully!");
    }

    // Update Employee
    public void updateEmployee(String id, String name, int age,
            String email, String phone, double salary) {
        Employee e = findById(id);
        if (e == null) {
            System.out.println("Employee not found!");
            return;
        }
        if (Validation.isValidName(name)) {
            e.setName(name);
        }
        if (Validation.isValidAge(age)) {
            e.setAge(age);
        }
        if (Validation.isValidEmail(email)) {
            e.setEmail(email);
        }
        if (Validation.isValidPhone(phone)) {
            e.setPhone(phone);
        }
        if (Validation.isValidSalary(salary)) {
            e.setSalary(salary);
        }
        System.out.println("Employee updated successfully!");
    }

    // Find ID
    public Employee findById(String id) {
        for (Employee e : this.list) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }

    // Find name
    public ArrayList<Employee> findByName(String keyword) {
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee e : this.list) {
            if (e.getName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(e);
            }
        }
        return result;
    }

    // Display all
    public void displayAll() {
        if (this.list.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        System.out.println("===== EMPLOYEE LIST =====");
        for (Employee e : this.list) {
            System.out.println("----------------------------");
            System.out.println(e);                          // da hinh toString()
            System.out.println("Total Salary: " + formatVND(e.calculateTotalSalary())); // da hinh
        }
        System.out.println("Total employees: " + this.list.size());
    }
}


