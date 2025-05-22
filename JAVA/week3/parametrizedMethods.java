package week3;

public class parametrizedMethods {

    public static void multiplication(int a, int b){
        System.out.println("multiplication="+ (a*b));

    }

    public static int arraySum(int[] numbers) {
        int sum = 0;
        for (int val : numbers) {
            sum += val;
        }
        return sum;
    }

    public static void infoCalc(String name,int...values){

    }

    public static void main(String[] args) {
        multiplication(1,2);
        multiplication(4,5);
        multiplication(5,6);

        int[] numbers={1,2,3,4};
        arraySum(numbers);
        infoCalc("");
        infoCalc("", 2,3,4);
    }
}