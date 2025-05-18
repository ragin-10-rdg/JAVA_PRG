package week2;
import java.util.Scanner;
public class shoppingdiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total purchase amount: $");
        double PA = scanner.nextDouble();
        double Ds = 0.0;
        if (PA> 500) {
            Ds = PA * 0.20;
        } else if (PA >= 200 && PA <= 500) {
            Ds = PA * 0.10;
        } else {
            Ds = 0.0;
        }
        double FA = PA - Ds;
        System.out.println("Discount applied: $" + Ds);
        System.out.println("Final amount to be paid: $" + FA);
        scanner.close();
    }
}
