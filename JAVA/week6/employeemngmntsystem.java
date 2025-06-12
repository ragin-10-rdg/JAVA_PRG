package week6;

abstract class Employee {
    String name;
    int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Abstract methods
    abstract double calculateSalary();
    abstract void displayDetails();
}

// Full-time employee class
class FullTimeEmployee extends Employee {
    double monthlySalary;

    public FullTimeEmployee(String name, int employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary; // Monthly fixed salary
    }

    @Override
    public void displayDetails() {
        System.out.println("Full-Time Employee:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeId);
        System.out.println("Salary: $" + calculateSalary());
    }
}

// Part-time employee class
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    public PartTimeEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked; // Based on hours worked
    }

    @Override
    public void displayDetails() {
        System.out.println("Part-Time Employee:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeId);
        System.out.println("Salary: $" + calculateSalary());
    }
}

// Main class
public class employeemngmntsystem {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Alice", 101, 50000);
        Employee emp2 = new PartTimeEmployee("Bob", 102, 500, 20);

        emp1.displayDetails();
        System.out.println();
        emp2.displayDetails();
    }
}
