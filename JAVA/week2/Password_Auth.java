package week2;
import java.util.Scanner;
public class Password_Auth {
    public static void main(String[] args) {
        final String correctPassword = "password123";
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean accessGranted = false;
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
        if (!accessGranted) {
            System.out.println("Account Locked.");
        }
    }
}
