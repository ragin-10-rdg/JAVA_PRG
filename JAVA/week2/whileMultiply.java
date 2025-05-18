package week2;

public class whileMultiply {
    public static void main(String[] args) {
        int number = 98;
        int i = 1; // Counter variable

        System.out.println("Multiplication Table of " + number + ":");

        // Print the multiplication table using a do-while loop
        do {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        } while (i <= 10);
    }
}
