package week3;

import java.util.Arrays;

public class methods {

    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.stream(numbers).sum());
        System.out.println(Arrays.stream(numbers).count());
        System.out.println(Arrays.binarySearch(numbers,3));
    }
}
