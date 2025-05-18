package week1;
public class typecasting{
    public static void main(String[] args) {
        // Implicit type casting
        int intValue = 10;
        double doubleValue = intValue;
        System.out.println("Implicit type casting (int to double): " + doubleValue);

        // Explicit type casting
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue;
        System.out.println("Explicit type casting (double to int): " + anotherIntValue);

        // Type casting with char
        char charValue = 'A';
        int charToInt = (int) charValue;
        System.out.println("Type casting (char to int): " + charToInt);
    }
}
