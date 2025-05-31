package week2;
import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an operation:");
        System.out.println("+ : Addition");
        System.out.println("- : Subtraction");
        System.out.println("* : Multiplication");
        System.out.println("/ : Division");
        System.out.print("Enter your choice: ");
        char operation = scanner.next().charAt(0);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        String res;
        switch (operation) {
            case '+' -> res = "Result: " + (num1 + num2);
            case '-' -> res = "Result: " + (num1 - num2);
            case '*' -> res = "Result: " + (num1 * num2);
            case '/' -> {
                if (num2 != 0) {
                    res = "Result: " + (num1 / num2);
                } else {
                    res = "Error: Division by zero is not allowed.";
                }
            }
            default -> res = "Invalid operation selected.";
        }
        System.out.println(res);
        scanner.close();
    }
}
