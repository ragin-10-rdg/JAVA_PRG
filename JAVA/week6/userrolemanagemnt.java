package week6;
enum Role {
    GUEST,
    USER,
    MODERATOR,
    ADMIN
}
public class userrolemanagemnt {
    public static void main(String[] args) {
        Role currentRole = Role.ADMIN;

        switch (currentRole) {
            case GUEST -> System.out.println("Access: View only");
            case USER -> System.out.println("Access: View and Edit");
            case MODERATOR -> System.out.println("Access: View, Edit, and Delete");
            case ADMIN -> System.out.println("Access: Full control");
        }
    }
}
