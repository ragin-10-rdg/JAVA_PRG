package week3;
public class ElementCounter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;
        int count = 0;

        for (int number : numbers) {
            if (number == target) {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}
