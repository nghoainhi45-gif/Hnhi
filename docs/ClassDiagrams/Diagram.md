classDiagram

class Employee{
    - id : String
    - name : String
    - age : int
    - salary : double
    - email : String
    - phone : String
    - dep : String
    - posn : String

    + Employee(id:String, name:String, age:int, salary:double, email:String, phone:String, dep:String, posn:String)
    + getId() : String
    + setId(id:String) : void
    + getName() : String
    + setName(name:String) : void
    + getAge() : int
    + setAge(age:int) : void
    + getSalary() : double
    + setSalary(salary:double) : void
    + calculateTotalSalary() : double
    + toString() : String
}

class Staff{
    - baseSalary : double
    - bonus : double
    - deduction : double

    + Staff(id:String, name:String, age:int, email:String, phone:String, salary:double, dep:String, posn:String, baseSalary:double, bonus:double, deduction:double)
    + calculateTotalSalary() : double
    + toString() : String
}

class Manager{
    - responsibilityAllowance : double

    + Manager(id:String, name:String, age:int, email:String, phone:String, salary:double, dep:String, posn:String, responsibilityAllowance:double)
    + calculateTotalSalary() : double
    + toString() : String
}

class Main{
    + main(args:String[]) : void
}

Employee <|-- Staff
Employee <|-- Manager
Main --> Employee
