package week4;
import java.util.Arrays;
import java.util.List;
public class ReservationSystem {
    static String[] reservationArr = {"2025-01-21", "2025-01-23", "2025-01-24", "2025-01-29"};
    static String[] bookedArr = {"2025-01-21", "2025-01-23"};
    public static boolean checkAvailability(String date) {
        List<String> reservationList = Arrays.asList(reservationArr);
        List<String> bookedList = Arrays.asList(bookedArr);
        if (reservationList.contains(date) && !bookedList.contains(date)) {
            return true; // Table available
        } else {
            return false; // Table not available
        }
    }
    public static void main(String[] args) {
        String dateToCheck = "2025-04-24";
        if (checkAvailability(dateToCheck)) {
            System.out.println("Table available on " + dateToCheck);
        } else {
            System.out.println("No table available on " + dateToCheck);
        }
    }
}
