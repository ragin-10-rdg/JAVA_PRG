package week3;

public class librarymngmtsystem {
    // Array of books and their availability
    String[] books = {"Java Programming", "Data Structures", "Algorithms"};
    boolean[] available = {true, true, true};

    // Method to check availability
    public boolean checkAvailability(String bookTitle) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equalsIgnoreCase(bookTitle)) {
                return available[i];
            }
        }
        return false;
    }

    // Method to borrow a book
    public boolean borrowBook(String bookTitle, String userId) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equalsIgnoreCase(bookTitle)) {
                if (available[i]) {
                    available[i] = false;
                    System.out.println(userId + " borrowed \"" + bookTitle + "\".");
                    return true;
                } else {
                    System.out.println("Sorry, \"" + bookTitle + "\" is not available.");
                    return false;
                }
            }
        }
        System.out.println("Book \"" + bookTitle + "\" not found in the library.");
        return false;
    }

    public static void main(String[] args) {
        librarymngmtsystem library = new librarymngmtsystem();
        String book = "Java Programming";
        String user = "User123";

        if (library.checkAvailability(book)) {
            System.out.println(book + " is available.");
        } else {
            System.out.println(book + " is not available.");
        }

        library.borrowBook(book, user);
        library.borrowBook(book, user);
    }
}

