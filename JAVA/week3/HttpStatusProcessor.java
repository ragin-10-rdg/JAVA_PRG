package week3;
import java.util.Scanner;
public class HttpStatusProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter HTTP status code: ");
        int statusCode = scanner.nextInt();
        switch (statusCode) {
            case 200:
                System.out.println("OK");
                break;
            case 404:
                System.out.println("Not Found");
                break;
            case 500:
                System.out.println("Internal Server Error");
                break;
            default:
                System.out.println("Unknown status");
                break;
        }
        scanner.close();
    }
}
