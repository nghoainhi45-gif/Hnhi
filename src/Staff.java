/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvien;

/**
 *
 * @author admin
 */
public class Staff extends Employee {

    private double baseSalary;
    private double bonus;
    private double deduction;

    public Staff(String id, String name, int age, String email, String phone,
            double salary, String dep, String posn,
            double baseSalary, double bonus, double deduction) {
        super(id, name, age, salary, email, phone, dep, posn);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.deduction = deduction;
    }

//    public double getBaseSalary() {
//        return this.baseSalary;
//    }
//
//    public void setBaseSalary(double baseSalary) {
//        this.baseSalary = baseSalary;
//    }
//
//    public double getBonus() {
//        return this.bonus;
//    }
//
//    public void setBonus(double bonus) {
//        this.bonus = bonus;
//    }
//
//    public double getDeduction() {
//        return this.deduction;
//    }
//
//    public void setDeduction(double deduction) {
//        this.deduction = deduction;
//    }
//// Phương thức tính lương tổng
//
//    public double calculateTotalSalary() {
//        return this.baseSalary + this.bonus - this.deduction;
//    } 
    @Override
    public double calculateTotalSalary() {
        return this.baseSalary + this.bonus - this.deduction;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nType: Staff" +
               "\nBase Salary: " + this.baseSalary +
               "\nBonus: " + this.bonus +
               "\nDeduction: " + this.deduction;
    }
}
