package week1;
import java.util.Scanner;
public class currencyconverter{
    public static void main(String[] args) {
        double cr = 132.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in USD: ");
        double usd = scanner.nextDouble();
        double npr = usd * cr;
        System.out.println(usd + " USD is equal to " + npr + " NPR.");
        scanner.close();
    }
}
