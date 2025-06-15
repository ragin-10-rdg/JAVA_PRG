package week6;
public class RaginKarkiW6 {

    // === Vehicle Management System (1) ===
    interface Vehicle {
        void start();

        void stop();
    }

    static class GeneralVehicle {
        String brand;
        int maxSpeed;

        GeneralVehicle(String brand, int maxSpeed) {
            this.brand = brand;
            this.maxSpeed = maxSpeed;
        }
    }

    static class Car extends GeneralVehicle implements Vehicle {
        int numberOfDoors;

        Car(String brand, int maxSpeed, int numberOfDoors) {
            super(brand, maxSpeed);
            this.numberOfDoors = numberOfDoors;
        }

        public void start() {
            System.out.println(brand + " Car starting.");
        }

        public void stop() {
            System.out.println(brand + " Car stopping.");
        }

        void display() {
            System.out.println("Car: " + brand + ", Max Speed: " + maxSpeed + ", Doors: " + numberOfDoors);
        }
    }

    static class Bike extends GeneralVehicle implements Vehicle {
        String handlebarType;

        Bike(String brand, int maxSpeed, String handlebarType) {
            super(brand, maxSpeed);
            this.handlebarType = handlebarType;
        }

        public void start() {
            System.out.println(brand + " Bike starting.");
        }

        public void stop() {
            System.out.println(brand + " Bike stopping.");
        }

        void display() {
            System.out.println("Bike: " + brand + ", Max Speed: " + maxSpeed + ", Handlebar: " + handlebarType);
        }
    }

    // === Employee Salary Calculation (2) ===
    static class Employee {
        String name;
        double baseSalary;

        Employee(String name, double baseSalary) {
            this.name = name;
            this.baseSalary = baseSalary;
        }
    }

    static class Manager extends Employee {
        double bonus;

        Manager(String name, double baseSalary, double bonus) {
            super(name, baseSalary);
            this.bonus = bonus;
        }

        double totalSalary() {
            return baseSalary + bonus;
        }
    }

    static class Developer extends Employee {
        int projects;

        Developer(String name, double baseSalary, int projects) {
            super(name, baseSalary);
            this.projects = projects;
        }

        double totalSalary() {
            return baseSalary + (projects * 500);
        }
    }

    // === Book Hierarchy (3) ===
    static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

    static class PrintedBook extends Book {
        int pages;

        PrintedBook(String title, String author, int pages) {
            super(title, author);
            this.pages = pages;
        }

        void displayDetails() {
            System.out.println("Printed Book: " + title + " by " + author + ", Pages: " + pages);
        }
    }

    static class EBook extends Book {
        double fileSize;
        String format;

        EBook(String title, String author, double fileSize, String format) {
            super(title, author);
            this.fileSize = fileSize;
            this.format = format;
        }

        void displayDetails() {
            System.out.println("EBook: " + title + " by " + author + ", Size: " + fileSize + "MB, Format: " + format);
        }
    }

    // === Book Lend/Return (4) ===
    static class SimpleBook {
        String title;
        String author;
        boolean isAvailable = true;

        SimpleBook(String title, String author) {
            this.title = title;
            this.author = author;
        }

        void lendBook() {
            if (isAvailable) {
                isAvailable = false;
                System.out.println("Book lent: " + title);
            } else {
                System.out.println("Book already borrowed.");
            }
        }

        void returnBook() {
            isAvailable = true;
            System.out.println("Book returned: " + title);
        }
    }

    // === Abstract Employee (5) ===
    static abstract class AbstractEmployee {
        String name;

        AbstractEmployee(String name) {
            this.name = name;
        }

        abstract void calculateSalary();

        abstract void displayDetails();
    }

    static class FullTimeEmployee extends AbstractEmployee {
        double salary;

        FullTimeEmployee(String name, double salary) {
            super(name);
            this.salary = salary;
        }

        void calculateSalary() {
            System.out.println("Full Time Salary: " + salary);
        }

        void displayDetails() {
            System.out.println("Full Time Employee: " + name);
        }
    }

    static class PartTimeEmployee extends AbstractEmployee {
        int hours;
        double rate;

        PartTimeEmployee(String name, int hours, double rate) {
            super(name);
            this.hours = hours;
            this.rate = rate;
        }

        void calculateSalary() {
            System.out.println("Part Time Salary: " + (hours * rate));
        }

        void displayDetails() {
            System.out.println("Part Time Employee: " + name);
        }
    }

    // === E-Commerce Order Processing (6) ===
    static class Order {
        int orderId;
        String customerName;
        double totalAmount;

        Order(int orderId, String customerName, double totalAmount) {
            this.orderId = orderId;
            this.customerName = customerName;
            this.totalAmount = totalAmount;
        }

        void calculateDiscount() {
            double discount = totalAmount > 1000 ? 0.1 * totalAmount : 0.05 * totalAmount;
            System.out.println("Final Amount after discount: " + (totalAmount - discount));
        }
    }

    // === Banking System (7) ===

    // 7. Banking System
    static abstract class BankAccount {
        double balance;

        BankAccount(double balance) {
            this.balance = balance;
        }

        abstract void calculateInterest();
    }

    static class SavingsAccount extends BankAccount {
        SavingsAccount(double balance) {
            super(balance);
        }

        void calculateInterest() {
            System.out.println("Savings Interest: " + (balance * 0.04));
        }
    }

    static class CurrentAccount extends BankAccount {
        CurrentAccount(double balance) {
            super(balance);
        }

        void calculateInterest() {
            System.out.println("Current Account has no interest.");
        }
    }

    // 8. Payment Processing System
    static abstract class PaymentMethod {
        abstract void processPayment(double amount);
    }
    static class CreditCard extends PaymentMethod {
        void processPayment(double amount) {
            System.out.println("Processing Credit Card payment of $" + amount);
        }
    }
    static class PayPal extends PaymentMethod {
        void processPayment(double amount) {
            System.out.println("Processing PayPal payment of $" + amount);
        }
    }
    static class UPI extends PaymentMethod {
        void processPayment(double amount) {
            System.out.println("Processing UPI payment of $" + amount);
        }
    }
    // 9. Rental Vehicle System
    static abstract class RentalVehicle {
        String model;
        int year;
        RentalVehicle(String model, int year) {
            this.model = model;
            this.year = year;
        }
        abstract void calculateRent(int days);
    }
    static class RentCar extends RentalVehicle {
        RentCar(String model, int year) {
            super(model, year);
        }

        void calculateRent(int days) {
            System.out.println("Car Rent: " + (100 * days));
        }
    }
    static class RentBike extends RentalVehicle {
        RentBike(String model, int year) {
            super(model, year);
        }
        void calculateRent(int days) {
            System.out.println("Bike Rent: " + (20 * days));
        }
    }
    static class RentTruck extends RentalVehicle {
        RentTruck(String model, int year) {
            super(model, year);
        }
        void calculateRent(int days) {
            System.out.println("Truck Rent: " + (500 * days));
        }
    }
    // 10. Discount Strategies
    static abstract class Discount {
        abstract double getDiscount(double amount);
    }

    static class FestivalDiscount extends Discount {
        double getDiscount(double amount) {
            return amount * 0.2;
        }
    }

    static class SeasonalDiscount extends Discount {
        double getDiscount(double amount) {
            return amount * 0.15;
        }
    }

    static class CouponDiscount extends Discount {
        double getDiscount(double amount) {
            return 100;
        }
    }
    // 11. Smart Home Devices
    static abstract class SmartDevice {
        abstract void turnOn();
        abstract void turnOff();
    }
    static class SmartLight extends SmartDevice {
        void turnOn() {
            System.out.println("Light ON");
        }
        void turnOff() {
            System.out.println("Light OFF");
        }
    }
    static class SmartThermostat extends SmartDevice {
        void turnOn() {
            System.out.println("Thermostat ON");
        }
        void turnOff() {
            System.out.println("Thermostat OFF");
        }
    }
    static class SmartDoorLock extends SmartDevice {
        void turnOn() {
            System.out.println("Door Locked");
        }
        void turnOff() {
            System.out.println("Door Unlocked");
        }
    }

    // 12. User Role Management
    enum Role {
        ADMIN, MODERATOR, USER, GUEST
    }

    static class WebUser {
        String username;
        Role role;

        WebUser(String username, Role role) {
            this.username = username;
            this.role = role;
        }

        void checkPermissions() {
            switch (role) {
                case ADMIN -> System.out.println("Full access");
                case MODERATOR -> System.out.println("Moderation rights");
                case USER -> System.out.println("Standard access");
                case GUEST -> System.out.println("Read-only access");
            }
        }
    }

    // Main
    public static void main(String[] args) {
      System.out.println("\n=== User Role Management ===");
        WebUser admin = new WebUser("Rita", Role.ADMIN);
        WebUser guest = new WebUser("John", Role.GUEST);
        admin.checkPermissions();
        guest.checkPermissions();
    }
}

