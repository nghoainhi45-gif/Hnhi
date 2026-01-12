
## Đề xuất Dự án: Hệ thống Quản lý Nhân viên (Employee Management System)
# 1. Giới thiệu
- Hệ thống Quản lý Nhân viên là ứng dụng console giúp quản lý thông tin nhân viên trong công ty.
- Hệ thống cho phép:
- Thêm nhân viên và quản lý
- Hiển thị danh sách nhân viên
- Xóa và tìm kiếm nhân viên theo ID
- Quản lý phòng ban, chấm công, tính lương
- Lưu dữ liệu ra file và đọc từ file
 Hệ thống được xây dựng theo OOP Java, giúp sinh viên mới học hiểu và thực hành Class, Object, Inheritance, Polymorphism, Encapsulation.

## 2. Mục tiêu
- Áp dụng lập trình hướng đối tượng trong Java.
- Xây dựng cơ sở dữ liệu nhân viên trong bộ nhớ.
- Quản lý thông tin nhân viên, quản lý, lương thưởng, chấm công.
- Dễ dàng mở rộng và nâng cấp trong tương lai.

## 3. 10 lớp chức năng chính
 STT	 Lớp	                 Chức năng chính
  1	Employee	         Lưu thông tin nhân viên, hiển thị thông tin, getter/setter
  2	Manager	Kế thừa          Employee, thêm thưởng, tính tổng lương, override hiển thị
  3	EmployeeList	         Quản lý danh sách nhân viên: thêm, xóa, tìm kiếm, hiển thị
  4	Department	         Quản lý phòng ban, thêm nhân viên vào phòng ban, hiển thị nhân viên theo phòng ban
  5	Attendance	         Quản lý ngày công, tính lương theo số ngày làm việc
  6	SalaryCalculator	 Tính lương nhân viên, lương quản lý, tổng lương công ty
  7	FileHandler	         Lưu/đọc dữ liệu nhân viên ra/ từ file .txt hoặc .csv
  8	Menu	                 Hiển thị menu console, nhận lựa chọn từ người dùng
  9	EmployeeService	         Xử lý nghiệp vụ: cập nhật thông tin, tìm kiếm nâng cao, sắp xếp danh sách
  10	Main	                 Chạy chương trình: khởi tạo các lớp, gọi menu, điều khiển luồng chương trình

## 4. Công nghệ sử dụng
- Ngôn ngữ: Java
- IDE: NetBeans 17 / Eclipse
- Cấu trúc dữ liệu: ArrayList, HashMap (nếu cần)
- Kiến trúc: OOP (Class, Object, Inheritance, Polymorphism, Encapsulation)
- File lưu trữ: .txt hoặc .csv

## 5. Phân công nhóm (2-3 người)
Thành viên	Nhiệm vụ
    A	        Xây dựng lớp Employee, Manager, Attendance
    B	        Xây dựng EmployeeList, Department, SalaryCalculator
  Cả nhóm	Menu, EmployeeService, FileHandler, Main, test và tài liệu