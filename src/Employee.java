/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvien;

/**
 *
 * @author admin
 */
public class Employee {
    private String id;
    private String name;
    private int age;
    private double salary;
    private String email;
    private String phone;
    private String dep;
    private String posn;
    public Employee(String id, String name, int age, double salary, String email,
                       String phone,String dep,String posn){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.email = email;
        this.phone = phone;
        this.posn = posn;
        this.dep = dep;
    }
    public String getId(){ return this.id; }
    public void setId(String id ){ this.id = id; } 
    public String getName(){ return this.name; }
    public void setName(String name){ this.name = name; }
    public int getAge(){ return this.age; }
    public void setAge(int age ){ this.age = age; }
    public double getSalary(){ return this.salary;}
    public void setSalary(double salary){this.salary = salary; }
    public String getEmail() { return this.email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return this.phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getDep() { return this.dep; }
    public void setDep(String dep) { this.dep = dep; }
    public String getPosn() { return this.posn; }
    public void setPosn(String posn) { this.posn = posn; } 
}


