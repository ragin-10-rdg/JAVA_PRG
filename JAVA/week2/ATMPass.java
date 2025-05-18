package week2;

import java.util.Scanner;
public class ATMPass {
    public static void main(String[] args) {
        // Define the correct password
        final String correctPassword = "password123";

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        int attempts = 0;
        boolean accessGranted = false;

        // Allow up to 3 attempts using a do-while loop
        do {
            System.out.print("Enter your password: ");
            String enteredPassword = scanner.nextLine();
            attempts++;

            if (enteredPassword.equals(correctPassword)) {
                System.out.println("Access Granted");
                accessGranted = true;
                break;
            } else {
                System.out.println("Incorrect password. Attempts left: " + (3 - attempts));
            }
        } while (attempts < 3);

        // If access is not granted after 3 attempts, lock the account
        if (!accessGranted) {
            System.out.println("Account Locked.");
            scanner.close();
            return;
        }

        // Initial account balance
        double balance = 5000.0;

        // Loop until the balance becomes zero or less
        do {
            System.out.println("Your current balance is: $" + balance);
            System.out.print("Enter the amount to withdraw: ");
            double withdrawalAmount = scanner.nextDouble();

            // Check if the withdrawal amount is valid
            if (withdrawalAmount > balance) {
                System.out.println("Error: Insufficient balance. Please enter a valid amount.");
            } else if (withdrawalAmount <= 0) {
                System.out.println("Error: Withdrawal amount must be greater than zero.");
            } else {
                // Deduct the withdrawal amount from the balance
                balance -= withdrawalAmount;
                System.out.println("Withdrawal successful! Your new balance is: $" + balance);
            }

            System.out.println(); // Print a blank line for better readability
        } while (balance > 0);

        // Display a message when the balance becomes zero or less
        System.out.println("Your account balance is zero. No further withdrawals can be made.");

        // Close the scanner
        scanner.close();
    }
}