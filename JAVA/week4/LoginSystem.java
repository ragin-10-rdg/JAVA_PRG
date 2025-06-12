package week4;
import java.util.HashMap;
import java.util.Map;
public class LoginSystem {
    static Map<String, String> userDatabase = new HashMap<>();
    static {
        userDatabase.put("johnDoe", "password123");
        userDatabase.put("janeDoe", "securePass");
    }
    public static boolean validateUser(String username, String password) {
        if (userDatabase.containsKey(username)) {
            String storedPassword = userDatabase.get(username);
            return storedPassword.equals(password);
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String username = "johnDoe";
        String password = "password12";
        if (validateUser(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
