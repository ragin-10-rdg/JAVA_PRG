package week4;
public class empMS {
    private String name;
    private double salary;
    public empMS() {}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    private void setSalary(double salary) {
        this.salary = salary;
    }
    void updateSalary(double salary) {
        setSalary(salary);
    }
}
