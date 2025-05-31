package week2;
public class reversestring {
    public static void main(String[] args) {
            String original = "JAVAPROGRAMING";
            String reversed = "";
            for (int i = original.length() - 1; i >= 0; i--) {
                reversed += original.charAt(i);
            }
            System.out.println("Original String: " + original);
            System.out.println("Reversed String: " + reversed);
        }
}
























