package week3;

public class Array {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        int[] nums= new int[4];
        numbers[2]=100;
        System.out.println(nums[0]);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("==== for each loop ====");
        for (int value:numbers){
            System.out.println(value);
        }


    }
}
