package week1;
import java.util.Scanner;
public class variable{
    public static void main(String[] args) {
        // Declare and initialize a variable
        int newvalue = 10;
        float decimalNumber = 5.5f;
        double newprice = 10.99;
        long targetnumber = 100000456464L;
        char letter = 'A';
        String name = "Ram";
        System.out.println(newvalue);
        System.out.println(decimalNumber);

        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number:");
        int number = sc.nextInt();
        System.out.println("The number is: " + number);
    }
}