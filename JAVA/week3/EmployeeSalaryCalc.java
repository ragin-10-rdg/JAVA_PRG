// Employee Salary Calculator
// Write a method calculateSalarylint hoursWorked, double hourlyRate) that calculates ar employee's monthly salary based on the number of hours worked and the hourly rate.
// Add a method calculateBonus) that provides a bonus if the employee has worked extra hours.
// Extra hourly rate: Rs.2000
// 1 month working hour : 230 hm
// Monthly salary: Rs.50000

package week3;
public class EmployeeSalaryCalc {

    public static double calculateSalary(int hoursWorked, double hourlyRate) {
        int standardHours = 230;
        double monthlySalary = 50000;
        if (hoursWorked <= standardHours) {
            return monthlySalary;
        } else {
            return monthlySalary + calculateBonus(hoursWorked, hourlyRate);
        }
    }

    public static double calculateBonus(int hoursWorked, double hourlyRate) {
        int standardHours = 230;
        int extraHours = hoursWorked - standardHours;
        if (extraHours > 0) {
            return extraHours * 2000;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int hoursWorked = 240;
        double hourlyRate = 2000;

        double totalSalary = calculateSalary(hoursWorked, hourlyRate);
        System.out.println("Total Salary: Rs." + totalSalary);
    }
}