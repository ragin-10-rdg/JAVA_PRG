package week1;
import java.util.Scanner;
public class interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal (P): ");
        double p = scanner.nextDouble();

        System.out.print("Enter Time (T) in years: ");
        double t = scanner.nextDouble();

        System.out.print("Enter Rate of Interest (R): ");
        double r = scanner.nextDouble();

        double SI = (p * t * r) / 100;
        System.out.println("The Simple Interest is: " + SI);
        scanner.close();
    }
}


