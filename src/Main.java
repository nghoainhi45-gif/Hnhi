/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tuong Vy
 */
import java.util.ArrayList;
import java.util.Scanner;
  


// ===== LOP NHAN VIEN =====
class Employee {
    int id;
    String name;
    int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

// ===== CHUONG TRINH CHINH =====
public class Main {

    static ArrayList<Employee> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // ===== MAIN =====
    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== MENU QUAN LY NHAN VIEN =====");
            System.out.println("1. Them nhan vien");
            System.out.println("2. Sua nhan vien");
            System.out.println("3. Xoa nhan vien");
            System.out.println("4. Tim nhan vien");
            System.out.println("5. Hien thi danh sach nhan vien");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    editEmployee();
                    break;
                case 3:
                    deleteEmployee();
                    break;
                case 4:
                    searchEmployee();
                    break;
                case 5:
                    displayEmployee();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 0);
    }

    // ===== THEM NHAN VIEN =====
    static void addEmployee() {
        System.out.print("Nhap ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap ten: ");
        String name = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        int age = sc.nextInt();

        list.add(new Employee(id, name, age));
        System.out.println("Them nhan vien thanh cong!");
    }

    // ===== SUA NHAN VIEN =====
    static void editEmployee() {
        System.out.print("Nhap ID can sua: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee e : list) {
            if (e.id == id) {
                System.out.print("Nhap ten moi: ");
                e.name = sc.nextLine();

                System.out.print("Nhap tuoi moi: ");
                e.age = sc.nextInt();

                System.out.println("Sua thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay nhan vien!");
    }

    // ===== XOA NHAN VIEN =====
    static void deleteEmployee() {
        System.out.print("Nhap ID can xoa: ");
        int id = sc.nextInt();

        for (Employee e : list) {
            if (e.id == id) {
                list.remove(e);
                System.out.println("Xoa thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay nhan vien!");
    }

    // ===== TIM NHAN VIEN =====
    static void searchEmployee() {
        System.out.print("Nhap ID can tim: ");
        int id = sc.nextInt();

        for (Employee e : list) {
            if (e.id == id) {
                System.out.println("ID: " + e.id);
                System.out.println("Ten: " + e.name);
                System.out.println("Tuoi: " + e.age);
                return;
            }
        }
        System.out.println("Khong tim thay nhan vien!");
    }

    // ===== HIEN THI DANH SACH =====
    static void displayEmployee() {
        if (list.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }

        System.out.println("\n----- DANH SACH NHAN VIEN -----");
        for (Employee e : list) {
            System.out.println("ID: " + e.id +
                               " | Ten: " + e.name +
                               " | Tuoi: " + e.age);
        }
    }
}
