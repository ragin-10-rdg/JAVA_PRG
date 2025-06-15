package week7;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList{
    private static ArrayList<String> groceryList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Grocery List Manager ---");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Display items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    displayItems();
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1-4.");
            }
        } while (choice != 4);
    }

    private static void addItem() {
        System.out.print("Enter item to add: ");
        String item = scanner.nextLine();
        groceryList.add(item);
        System.out.println(item + " added to the grocery list.");
    }

    private static void removeItem() {
        System.out.print("Enter item to remove: ");
        String item = scanner.nextLine();
        if (groceryList.remove(item)) {
            System.out.println(item + " removed from the grocery list.");
        } else {
            System.out.println(item + " not found in the list.");
        }
    }

    private static void displayItems() {
        if (groceryList.isEmpty()) {
            System.out.println("The grocery list is empty.");
        } else {
            System.out.println("Grocery List:");
            for (int i = 0; i < groceryList.size(); i++) {
                System.out.println((i + 1) + ". " + groceryList.get(i));
            }
        }
    }
}

