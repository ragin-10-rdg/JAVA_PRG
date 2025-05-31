package week2;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int f = 0, s= 1;
        System.out.print("Fibonacci Series: " + f + " " + s);
        for (int i = 2; i < n; i++) {
            int nx = f + s;
            System.out.print(" " + nx);
            f = s;
            s = nx;
        }
        System.out.println();
    }
}

