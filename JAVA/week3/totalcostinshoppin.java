package week3;
import java.util.Scanner;
public class totalcostinshoppin {
    public static double calculateTotal(double[] prices) {
        double total = 0;

        for (double price : prices) {
            total += price;
        }

        double discount = 0.0;

        if (total > 1000) {
            discount = 0.20;
        } else if (total > 600) {
            discount = 0.10;
        }

        total = total - (total * discount);

        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int itemCount = scanner.nextInt();

        double[] itemPrices = new double[itemCount];

        for (int i = 0; i < itemCount; i++) {
            System.out.print("Enter price for item " + (i + 1) + ": ");
            itemPrices[i] = scanner.nextDouble();
        }

        double totalCost = calculateTotal(itemPrices);
        System.out.println("Total cost after discount: Rs. " + totalCost);

        scanner.close();
    }
}
