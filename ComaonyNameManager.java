class Employee5 {
    String name;
    double salary;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager5 extends Employee5 {
    String department;

    @Override
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class CompanyManagerExample {
    public static void main(String[] args) {
        Manager5 m = new Manager5();
        m.name = "Ankita";
        m.salary = 75000;
        m.department = "Human Resources";
        m.displayInfo();
    }
}
