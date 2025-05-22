package week3;

public class arraycount {
    public static void main(String[] args) {
        int[] numbers={1,2,3,2,4,2,5};
        int target = 1;
        int count = 0;

        for (int num : numbers) {
            if (num == target) {
                count++;
            }
        }

        System.out.println("Target: " + target);
        System.out.println("Count: " + count);
    }
}