package week5;

import java.util.ArrayList;

// Base class
class Vehicle {
    protected String brand;
    protected int maxSpeed;

    public Vehicle(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Car subclass
class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int maxSpeed, int numDoors) {
        super(brand, maxSpeed);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}

// Bike subclass
class Bike extends Vehicle {
    private String handlebarType;

    public Bike(String brand, int maxSpeed, String handlebarType) {
        super(brand, maxSpeed);
        this.handlebarType = handlebarType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Handlebar Type: " + handlebarType);
    }
}

// Main class
public class VehicleManagementSystem {
    public static void main(String[] args) {
        // List of vehicles
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        // Add cars
        vehicles.add(new Car("Honda", 200, 4));
        vehicles.add(new Car("BMW", 240, 2));
        vehicles.add(new Car("Ford", 190, 4));

        // Add bikes
        vehicles.add(new Bike("Yamaha", 150, "Clip-on"));
        vehicles.add(new Bike("Royal Enfield", 130, "Cruiser"));
        vehicles.add(new Bike("Ducati", 270, "Sport"));

        // Display info
        for (Vehicle v : vehicles) {
            System.out.println("\n--- Vehicle Details ---");
            v.displayInfo();
        }
    }
}
