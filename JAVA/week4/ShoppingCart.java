package week4;

public class ShoppingCart {

    public double calculateTotal(double[] itemPrices) {
        double total = 0.0;
        for (double price : itemPrices) {
            total += price;
        }
        if (total > 1000) {
            total -= total * 0.20;
        } else if (total > 600) {
            total -= total * 0.10;
        }

        return total;
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        double[] prices = {250.0, 300.0, 150.0, 400.0}; // Example items
        double totalCost = cart.calculateTotal(prices);
        System.out.println("Total cost after discount: $" + totalCost);
    }
}
