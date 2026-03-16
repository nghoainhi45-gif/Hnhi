/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvien;

/**
 *
 * @author admin
 */
/*import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();
        NumberFormat vn = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));

        System.out.print("Nhập số lượng nhân viên: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            System.out.println("\n===== Nhân viên thứ " + (i + 1) + " =====");
            System.out.println("1. Staff");
            System.out.println("2. Manager");
            System.out.print("Chọn loại: ");
            int choice = Integer.parseInt(sc.nextLine());

            System.out.print("ID: ");
            String id = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = Integer.parseInt(sc.nextLine());

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Phone: ");
            String phone = sc.nextLine();

            System.out.print("Department: ");
            String dep = sc.nextLine();

            System.out.print("Position: ");
            String posn = sc.nextLine();

            if (choice == 1) {

                System.out.print("Base Salary: ");
                double baseSalary = sc.nextDouble();

                System.out.print("Bonus: ");
                double bonus = sc.nextDouble();

                System.out.print("Deduction: ");
                double deduction = sc.nextDouble();

                Staff staff = new Staff(id, name, age, email, phone,
                        0, dep, posn,
                        baseSalary, bonus, deduction);

                list.add(staff);

            } else if (choice == 2) {

                System.out.print("Salary: ");
                double salary = sc.nextDouble();

                System.out.print("Responsibility Allowance: ");
                double allowance = sc.nextDouble();

                Manager manager = new Manager(id, name, age, email, phone,
                        salary, dep, posn,
                        allowance);

                list.add(manager);
            }
        }

        // ====== Xuất danh sách ======
        System.out.println("\n===== DANH SÁCH NHÂN VIÊN =====");

        for (Employee e : list) {

            System.out.println("----------------------------");
            System.out.println("ID: " + e.getId());
            System.out.println("Name: " + e.getName());
            System.out.println("Age: " + e.getAge());
            System.out.println("Department: " + e.getDep());
            System.out.println("Position: " + e.getPosn());

            if (e instanceof Staff) {
                Staff s = (Staff) e;
                System.out.println("Total Salary: " + vn.format(s.calculateTotalSalary()));

            } else if (e instanceof Manager) {
                Manager m = (Manager) e;
                System.out.println("Total Salary: " + vn.format(m.calculateTotalSalary()));
            }
        }

        sc.close();
    }
}
 */
// no_polymorphims

/*import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Staff> staffList = new ArrayList<>();
        ArrayList<Manager> managerList = new ArrayList<>();
        NumberFormat vn = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));

        System.out.print("Nhập số lượng nhân viên: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            System.out.println("\n===== Nhân viên thứ " + (i + 1) + " =====");
            System.out.println("1. Staff");
            System.out.println("2. Manager");
            System.out.print("Chọn loại: ");
            int choice = Integer.parseInt(sc.nextLine());

            System.out.print("ID: ");
            String id = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = Integer.parseInt(sc.nextLine());

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Phone: ");
            String phone = sc.nextLine();

            System.out.print("Department: ");
            String dep = sc.nextLine();

            System.out.print("Position: ");
            String posn = sc.nextLine();

            if (choice == 1) {

                System.out.print("Base Salary: ");
                double baseSalary = Double.parseDouble(sc.nextLine());

                System.out.print("Bonus: ");
                double bonus = Double.parseDouble(sc.nextLine());

                System.out.print("Deduction: ");
                double deduction = Double.parseDouble(sc.nextLine());

                Staff staff = new Staff(id, name, age, email, phone,
                        0, dep, posn,
                        baseSalary, bonus, deduction);

                staffList.add(staff);

            } else if (choice == 2) {

                System.out.print("Salary: ");
                double salary = Double.parseDouble(sc.nextLine());

                System.out.print("Responsibility Allowance: ");
                double allowance = Double.parseDouble(sc.nextLine());

                Manager manager = new Manager(id, name, age, email, phone,
                        salary, dep, posn,
                        allowance);

                managerList.add(manager);
            }
        }

        // ===== In Staff =====
        System.out.println("\n===== DANH SÁCH STAFF =====");

        for (Staff s : staffList) {
            System.out.println("----------------------------");
            System.out.println("ID: " + s.getId());
            System.out.println("Name: " + s.getName());
            System.out.println("Age: " + s.getAge());
            System.out.println("Department: " + s.getDep());
            System.out.println("Position: " + s.getPosn());
            System.out.println("Total Salary: " + vn.format(s.calculateTotalSalary()));
        }

        // ===== In Manager =====
        System.out.println("\n===== DANH SÁCH MANAGER =====");

        for (Manager m : managerList) {
            System.out.println("----------------------------");
            System.out.println("ID: " + m.getId());
            System.out.println("Name: " + m.getName());
            System.out.println("Age: " + m.getAge());
            System.out.println("Department: " + m.getDep());
            System.out.println("Position: " + m.getPosn());
            System.out.println("Total Salary: " + vn.format(m.calculateTotalSalary()));
        }

        sc.close();
    }
}
 */
//From file
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        NumberFormat vn = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
        try {
            File file = new File("data.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {

                String line = sc.nextLine();
                String[] parts = line.split(",");

                int type = Integer.parseInt(parts[0]);

                if (type == 1) {
                    // Staff
                    Staff s = new Staff(
                            parts[1], // id
                            parts[2], // name
                            Integer.parseInt(parts[3]), // age
                            parts[5], // email
                            parts[6], // phone
                            Double.parseDouble(parts[4]), // salary
                            parts[7], // dep
                            parts[8], // posn
                            Double.parseDouble(parts[9]), // baseSalary
                            Double.parseDouble(parts[10]),// bonus
                            Double.parseDouble(parts[11]) // deduction
                    );
                    list.add(s);

                } else if (type == 2) {
                    // Manager
                    Manager m = new Manager(
                            parts[1],
                            parts[2],
                            Integer.parseInt(parts[3]),
                            parts[5],
                            parts[6],
                            Double.parseDouble(parts[4]),
                            parts[7],
                            parts[8],
                            Double.parseDouble(parts[9]) // responsibilityAllowance
                    );
                    list.add(m);
                }
            }

            sc.close();

            // ===== In danh sách =====
            System.out.println("===== EMPLOYEE LIST =====");

            for (Employee e : list) {
                System.out.println("----------------------------");
                System.out.println(e);

//                System.out.println("----------------------------");
//                System.out.println("ID: " + e.getId());
//                System.out.println("Name: " + e.getName());
//                System.out.println("Age: " + e.getAge());
//                System.out.println("Department: " + e.getDep());
//                System.out.println("Position: " + e.getPosn());
//                if (e instanceof Staff) {
//                    Staff s = (Staff) e;
//                    System.out.println("Total Salary: " + vn.format(s.calculateTotalSalary()));
//
//                } else if (e instanceof Manager) {
//                    Manager m = (Manager) e;
//                    System.out.println("Total Salary: " + vn.format(m.calculateTotalSalary()));
//                }
                System.out.println("Total Salary: "
                        + vn.format(e.calculateTotalSalary()));
            }

        } catch (Exception e) {
            System.out.println("File error: " + e.getMessage());
        }
    }

    
}
