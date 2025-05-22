package week3;
import java.util.Scanner;
public class restaurantreservesystem {
    static String[] bookedArr = {"2025-01-21", "2025-01-23"};


    public static boolean checkAvailability(String date) {
        for (String bookedDate : bookedArr) {
            if (bookedDate.equals(date)) {
                return false;
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter reservation date (YYYY-MM-DD): ");
        String inputDate = scanner.nextLine();

        if (checkAvailability(inputDate)) {
            System.out.println("Table is available on " + inputDate);
        } else {
            System.out.println("Sorry, no table available on " + inputDate);
        }

        scanner.close();
    }
}
