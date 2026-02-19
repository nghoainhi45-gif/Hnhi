/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvien;

/**
 *
 * @author admin
 */
public class Manager extends Employee{
    private double responsibilityAllowance;

    public Manager(String id, String name, int age, String email, String phone,
                   double salary, String department, String position,
                   double responsibilityAllowance) {
        super(id, name, age, salary, email, phone,department, position);
        this.responsibilityAllowance = responsibilityAllowance;
    }

    public double getResponsibilityAllowance() { return this.responsibilityAllowance; }
    public void setResponsibilityAllowance(double responsibilityAllowance) {
        this.responsibilityAllowance = responsibilityAllowance;
    }

    // Phương thức tính phụ cấp
    public double calculateAllowance() {
        return this.responsibilityAllowance;
    }
    
}
