package week2;
import java.util.Scanner;
public class multiplicationfor {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("Multiplication Table of " + number + ":");
            for (int i = 1; i <= 20; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }

            scanner.close();
        }
}


