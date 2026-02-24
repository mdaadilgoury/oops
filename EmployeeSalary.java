package oops;
class Employee{
    String name;
    double salary;
    Employee(String n , double s ){
        this.name= n;
        this.salary= s;
        System.out.println(" employee created : "+ name);
    }
    double calculatebonus(){
        return salary*0.10;
    }
    double totalsalary(){
        return salary+calculatebonus();
    }
    void showslip(){
        System.out.println("----- Salary Slip -----");
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " +salary);
        System.out.println("Bonus: " + calculatebonus());
        System.out.println("Final Salary: " + totalsalary());
    }
}
public class EmployeeSalary {
    public static void main(String[] args) {
    Employee e1 = new Employee("Aadil", 42700);
    e1.showslip();
    }
}
