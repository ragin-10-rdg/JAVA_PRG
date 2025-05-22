package week3;
import java.util.Scanner;
public class restaurantreservesystem {
    static String[] bookedArr = {"2025-01-21", "2025-01-23"};

    // Method to check table availability
    public static boolean checkAvailability(String date) {
        for (String bookedDate : bookedArr) {
            if (bookedDate.equals(date)) {
                return false; // Not available
            }
        }
        return true; // Available
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the date they want to check
        System.out.print("Enter reservation date (YYYY-MM-DD): ");
        String inputDate = scanner.nextLine();

        // Check availability
        if (checkAvailability(inputDate)) {
            System.out.println("Table is available on " + inputDate);
        } else {
            System.out.println("Sorry, no table available on " + inputDate);
        }

        scanner.close();
    }
}
