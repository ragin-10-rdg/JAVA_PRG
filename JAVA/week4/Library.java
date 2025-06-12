package week4;
import java.util.ArrayList;
import java.util.List;

public class Library {

    // List of available books
    private List<String> availableBooks = new ArrayList<>();

    // Constructor to add some books
    public Library() {
        availableBooks.add("The Alchemist");
        availableBooks.add("To Kill a Mockingbird");
        availableBooks.add("Pride and Prejudice");
    }

    // Method to check availability of a book
    public boolean checkAvailability(String bookTitle) {
        return availableBooks.contains(bookTitle);
    }

    // Method to borrow a book
    public boolean borrowBook(String bookTitle) {
        if (checkAvailability(bookTitle)) {
            availableBooks.remove(bookTitle);
            System.out.println("You have borrowed: " + bookTitle);
            return true;
        } else {
            System.out.println("Book not available: " + bookTitle);
            return false;
        }
    }

    // Test method
    public static void main(String[] args) {
        Library library = new Library();

        String bookToBorrow = "The Alchemist";
        if (library.checkAvailability(bookToBorrow)) {
            library.borrowBook(bookToBorrow);
        } else {
            System.out.println("Sorry, the book is not available.");
        }

        // Checking availability after borrowing
        library.checkAvailability(bookToBorrow);
    }
}
