package week4;

public class empMS {
    private String name;
    private double salary; // salary is private

    // Constructor (optional)
    public empMS() {}

    // Getter and setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter for salary (no setter here for direct access)
    public double getSalary() {
        return salary;
    }

    // Private setter for salary - only accessible within the class
    private void setSalary(double salary) {
        this.salary = salary;
    }

    // HR can access this method using HR class
    void updateSalary(double salary) {
        setSalary(salary);
    }
}
