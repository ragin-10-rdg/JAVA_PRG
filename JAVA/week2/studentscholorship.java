package week2;
import java.util.Scanner;
public class studentscholorship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        if (gpa >= 3.5) {
            System.out.println("Eligible for full scholarship.");
        } else if (gpa >= 3.0 && gpa < 3.5) {
            System.out.println("Eligible for partial scholarship.");
        } else {
            System.out.println("Not eligible for scholarship.");
        }
        scanner.close();
    }
}

