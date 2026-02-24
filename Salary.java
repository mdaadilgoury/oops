package oops.inharitacepolymorphism;
class Employee{
    void showsalary(){
        System.out.println("base salary 30000");
    }
}
class Devloper extends Employee{
    @Override
    void showsalary() {
        System.out.println("Devloper salary 60000");
    }
}
class Manager extends Employee {
    @Override
    void showsalary() {
        System.out.println("Manager salary 80000");
    }
}
class Salary {
    public static void main(String[] args) {
        Employee obj1 = new Employee();
        obj1.showsalary();

        Employee obj2 = new Devloper();
        obj2.showsalary();

        Employee obj3 = new Manager();
        obj3.showsalary();

    }
}

