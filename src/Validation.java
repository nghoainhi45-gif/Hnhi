/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvien;

/**
 *
 * @author admin
 */
public class Validation {
     // check employee code
    public static boolean isValidId(String id) {
        if (id == null || id.isEmpty()) {
            return false;
        }
        return id.matches("[A-Z]\\d+");
    }

    public static boolean isValidName(String name) {
        if (name == null) {
            return false;
        }
        return name.trim().length() >= 1;
    }

    public static boolean isValidAge(int age) {
        return age >= 18 && age <= 65;
    }

    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        return email.matches("^[\\w.]+@gmail\\.com$");
    }

    public static boolean isValidPhone(String phone) {
        if (phone == null) {
            return false;
        }
        return phone.matches("0[0-9]{9}");
    }

    public static boolean isValidSalary(double salary) {
        return salary >= 0;
    }
}
    

