
# Đề xuất Dự án: Hệ thống Quản lý Nhân viên (Employee Management System)
## 1. Giới thiệu
- Hệ thống Quản lý Nhân viên là một ứng dụng console được xây dựng nhằm quản lý thông tin nhân viên trong công ty theo hướng lập trình hướng đối tượng (OOP).
- Hệ thống cho phép thực hiện các chức năng chính như:
  + Quản lý thông tin nhân viên thông qua lớp Employee
  + Phân loại nhân viên thường (Staff) và nhân viên quản lý (Manager)
  + Quản lý phòng ban (Department) và chức vụ (Position)
  + Quản lý chấm công thông qua lớp Attendance
  + Tính lương cho nhân viên bằng lớp Salary
  + Quản lý danh sách nhân viên với các chức năng thêm, sửa, xóa, tìm kiếm và hiển thị thông qua lớp EmployeeManager
  + Kiểm tra tính hợp lệ của dữ liệu đầu vào bằng lớp Validation
  + Chương trình được điều khiển thông qua menu chính trong lớp Main.
 

## 2. Mục tiêu
- Áp dụng lập trình hướng đối tượng trong Java.
- Xây dựng cơ sở dữ liệu nhân viên trong bộ nhớ.
- Quản lý thông tin nhân viên, quản lý, lương thưởng, chấm công.
- Dễ dàng mở rộng và nâng cấp trong tương lai.

# Employee Management System (OOP)

## Overview
Hệ thống quản lý nhân viên được thiết kế theo mô hình **OOP (Object-Oriented Programming)**.
Tài liệu này mô tả **10 lớp chính** trong hệ thống và vai trò của từng lớp.

---

## 1. Employee
**Vai trò:** Lớp cha, lưu trữ thông tin chung của mọi nhân viên.

**Thuộc tính:**
- id
- name
- age
- email
- phone
- salary
- department
- position

---

## 2. Staff
**Vai trò:** Nhân viên thường (kế thừa Employee).

**Thuộc tính thêm:**
- overtimeHours

---

## 3. Manager
**Vai trò:** Nhân viên quản lý (kế thừa Employee).

**Thuộc tính thêm:**
- responsibilityAllowance

---

## 4. Department
**Vai trò:** Quản lý thông tin phòng ban.

**Thuộc tính:**
- departmentId
- departmentName
- description

---

## 5. Position
**Vai trò:** Quản lý chức vụ và phụ cấp.

**Thuộc tính:**
- positionId
- positionName
- allowance

---

## 6. Attendance
**Vai trò:** Quản lý chấm công.

**Thuộc tính:**
- employeeId
- workingDays
- absentDays

---

## 7. Salary
**Vai trò:** Xử lý lương cho nhân viên.

**Thuộc tính:**
- baseSalary
- bonus
- deduction

**Phương thức:**
- calculateTotalSalary()

---

## 8. Validation
**Vai trò:** Kiểm tra dữ liệu đầu vào (static methods).

**Chức năng:**
- isValidId()
- isValidName()
- isValidAge()
- isValidEmail()
- isValidPhone()
- isValidSalary()

---

## 9. EmployeeManager
**Vai trò:** Quản lý danh sách nhân viên (CRUD).

**Thuộc tính:**
- List<Employee> employees

**Phương thức:**
- addEmployee()
- updateEmployee()
- deleteEmployee()
- findById()
- displayAll()

---

## 10. Main (Program)
**Vai trò:** Chạy chương trình và hiển thị menu.

**Chức năng:**
- main()
- Menu thêm / sửa / xóa / tìm / hiển thị nhân viên

---

## Relationships (Tóm tắt)
- Employee là lớp cha của Staff và Manager
- Employee liên kết với Department và Position
- EmployeeManager quản lý danh sách Employee

