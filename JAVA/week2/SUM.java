package week2;

public class SUM {
    public static void main(String[] args){
        int num=3456;
        int sum=0;

        StringBuilder reverse=new StringBuilder("");

        while (num!= 0){
           int digit=num%10;
           sum+=digit;
           reverse.append(digit);
           num=num/10;
       }
        System.out.println("The Sum of the Numbers is = "+sum);
        System.out.println("The Reverse of the Numbers is = z"+reverse);
    }
}