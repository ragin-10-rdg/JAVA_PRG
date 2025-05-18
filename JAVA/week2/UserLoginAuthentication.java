package week2;
import java.util.Scanner;
public class UserLoginAuthentication {
    public static void main(String[] args) {
        String validUsername = "admin";
        String validPassword = "password123";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();
        if (username.equals(validUsername)) {
            if (password.equals(validPassword)) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Incorrect password.");
            }
        } else {
            System.out.println("Username not found.");
        }
    }
}
