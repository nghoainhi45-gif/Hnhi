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
/*import java.io.File;
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
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    static Scanner input = new Scanner(System.in);
    static EmployeeManager manager = new EmployeeManager();
    static NumberFormat vn = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));

    // ✅ Helper đọc số nguyên
    static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(input.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid! Enter a number.");
            }
        }
    }

    // ✅ Helper đọc số thực
    static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(input.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid! Enter a number.");
            }
        }
    }

    // ✅ Helper đọc chuỗi
    static String readString(String prompt) {
        System.out.print(prompt);
        return input.nextLine().trim();
    }

    public static void main(String[] args) {
        loadFromFile("data.txt");

        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Display all employee");
            System.out.println("2. Find by ID");
            System.out.println("3. Find by Name");
            System.out.println("4. Add employee");
            System.out.println("5. Update employee");
            System.out.println("6. Delete employee");
            System.out.println("0. Exit");
            choice = readInt("Choose: ");

            switch (choice) {
                case 1:
                    displayAll();
                    break;
                case 2:
                    findById();
                    break;
                case 3:
                    findByName();
                    break;
                case 4:
                    addEmployee();
                    break;
                case 5:
                    updateEmployee();
                    break;
                case 6:
                    deleteEmployee();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        input.close();
    }

    static void loadFromFile(String filename) {
        try {
            Scanner sc = new Scanner(new File(filename));
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                if (line.isEmpty()) {
                    continue;
                }
                Employee e = createEmployee(line.split(","));
                if (e != null) {
                    manager.addEmployee(e);
                }
            }
            sc.close();
            System.out.println("Loaded " + manager.getList().size() + " employees.");
        } catch (Exception e) {
            System.out.println("File not found. Starting with empty list.");
        }
    }

    static Employee createEmployee(String[] p) {
        int type = Integer.parseInt(p[0]);
        if (type == 1) {
            return new Staff(p[1], p[2], Integer.parseInt(p[3]), p[5], p[6],
                    Double.parseDouble(p[4]), p[7], p[8],
                    Double.parseDouble(p[9]), Double.parseDouble(p[10]), Double.parseDouble(p[11]));
        }
        if (type == 2) {
            return new Manager(p[1], p[2], Integer.parseInt(p[3]), p[5], p[6],
                    Double.parseDouble(p[4]), p[7], p[8], Double.parseDouble(p[9]));
        }
        return null;
    }

    static void printEmployee(Employee e) {
        System.out.println("----------------------------");
        System.out.println(e);
        System.out.println("Total Salary: " + vn.format(e.calculateTotalSalary()));
    }

    static void displayAll() {
        if (manager.getList().isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        System.out.println("===== EMPLOYEE LIST =====");
        for (Employee e : manager.getList()) {
            printEmployee(e);
        }
        System.out.println("Total: " + manager.getList().size() + " employees");
    }

    static void findById() {
        Employee e = manager.findById(readString("Enter ID: "));
        if (e != null) {
            printEmployee(e);
        } else {
            System.out.println("Employee not found!");
        }
    }

    static void findByName() {
        ArrayList<Employee> results = manager.findByName(readString("Enter name keyword: "));
        if (results.isEmpty()) {
            System.out.println("Employee not found!");
            return;
        }
        System.out.println("Found " + results.size() + " employee(s):");
        for (Employee e : results) {
            printEmployee(e);
        }
    }

    static void addEmployee() {
        int type = readInt("Type (1=Staff, 2=Manager): ");
        String newId = readString("ID: ");
        String newName = readString("Name: ");
        int newAge = readInt("Age: ");
        String newEmail = readString("Email: ");
        String newPhone = readString("Phone: ");
        double newSal = readDouble("Salary: ");
        String newDep = readString("Department: ");
        String newPosn = readString("Position: ");

        if (!Validation.isValidId(newId)) {
            System.out.println("Invalid ID!");
            return;
        }
        if (!Validation.isValidName(newName)) {
            System.out.println("Invalid Name!");
            return;
        }
        if (!Validation.isValidAge(newAge)) {
            System.out.println("Invalid Age (18-65)!");
            return;
        }
        if (!Validation.isValidEmail(newEmail)) {
            System.out.println("Invalid Email!");
            return;
        }
        if (!Validation.isValidPhone(newPhone)) {
            System.out.println("Invalid Phone!");
            return;
        }
        if (!Validation.isValidSalary(newSal)) {
            System.out.println("Invalid Salary!");
            return;
        }

        Employee newE;
        if (type == 1) {
            newE = new Staff(newId, newName, newAge, newEmail, newPhone, newSal, newDep, newPosn,
                    readDouble("Base Salary: "), readDouble("Bonus: "), readDouble("Deduction: "));
        } else if (type == 2) {
            newE = new Manager(newId, newName, newAge, newEmail, newPhone, newSal, newDep, newPosn,
                    readDouble("Responsibility Allowance: "));
        } else {
            System.out.println("Invalid type!");
            return;
        }
        manager.addEmployee(newE);
    }

    static void updateEmployee() {
        Employee e = manager.findById(readString("Enter ID to update: "));
        if (e == null) {
            System.out.println("Employee not found!");
            return;
        }

        System.out.println("(Press Enter to keep current value)");

        String name = readString("New Name [" + e.getName() + "]: ");
        if (name.isEmpty()) {
            name = e.getName();
        }

        String ageStr = readString("New Age [" + e.getAge() + "]: ");
        int age = ageStr.isEmpty() ? e.getAge() : Integer.parseInt(ageStr);

        String email = readString("New Email [" + e.getEmail() + "]: ");
        if (email.isEmpty()) {
            email = e.getEmail();
        }

        String phone = readString("New Phone [" + e.getPhone() + "]: ");
        if (phone.isEmpty()) {
            phone = e.getPhone();
        }

        String salStr = readString("New Salary [" + vn.format(e.getSalary()) + "]: ");
        double sal = salStr.isEmpty() ? e.getSalary() : Double.parseDouble(salStr);

        manager.updateEmployee(e.getId(), name, age, email, phone, sal);
    }

    static void deleteEmployee() {
        manager.deleteEmployee(readString("Enter ID to delete: "));
    }
}
