package week5;
// Base class
class Employee {
    protected String name;
    protected double baseSalary;
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public double calculateSalary() {
        return baseSalary;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
    }
}
// Manager subclass
class Manager extends Employee {
    private double bonus;
    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}
// Developer subclass
class Developer extends Employee {
    private int numProjects;
    public Developer(String name, double baseSalary, int numProjects) {
        super(name, baseSalary);
        this.numProjects = numProjects;
    }
    @Override
    public double calculateSalary() {
        return baseSalary + (500 * numProjects);
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Projects: " + numProjects);
        System.out.println("Project Bonus: $" + (500 * numProjects));
        System.out.println("Total Salary: $" + calculateSalary());
    }
}
// Main class
public class EmployeeSalaryCalculation {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 5000, 1200);
        Developer developer = new Developer("Bob", 4000, 4);
        System.out.println("=== Manager Details ===");
        manager.displayInfo();
        System.out.println("\n=== Developer Details ===");
        developer.displayInfo();
    }
}
