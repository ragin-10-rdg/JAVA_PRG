package week2;
import java.util.Scanner;
public class ATMWithdrwal {
    public static void main(String[] args) {
        double balance = 50000;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Your current balance is: Rs " + balance);
            System.out.print("Enter the amount to withdraw: ");
            double withdrawalAmount = scanner.nextDouble();
            if (withdrawalAmount > balance) {
                System.out.println("Error: Insufficient balance. Please enter a valid amount.");
            } else if (withdrawalAmount <= 0) {
                System.out.println("Error: Withdrawal amount must be greater than zero.");
            } else {
                balance -= withdrawalAmount;
                System.out.println("Withdrawal successful! Your new balance is: Rs " + balance);
            }
            System.out.println();
        } while (balance > 0);
        System.out.println("Your account balance is zero. No further withdrawals can be made.");
        scanner.close();
    }
}
