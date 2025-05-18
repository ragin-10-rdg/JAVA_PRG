package week2;
import java.util.Scanner;
public class voter {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter age: ");
            int age = input.nextInt();

            if (age < 18) {
                System.out.println("Not eligible to vote.");
            } else if (age == 18) {
                System.out.println("Eligible to vote.");
            } else {
                System.out.println("Already eligible to vote.");
            }
        }
    }

