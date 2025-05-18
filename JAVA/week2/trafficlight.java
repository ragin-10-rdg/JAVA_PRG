package week2;
import java.util.Scanner;
public class trafficlight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the traffic light signal (red, yellow, green): ");
        String signal = scanner.nextLine().toLowerCase();
        String res = switch (signal) {
                case "red" -> "You should stop your vehicle";
                case "yellow" -> "Slow Down tour vehicle";
                case "green" -> "You can Go";
                default -> "Your Signal is Invalid";
        };
        System.out.println(res);
        }
    }