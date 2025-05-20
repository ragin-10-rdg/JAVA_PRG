package week3;

public class arrayexample {
    public static void main(String[] args) {
        int[] numbers={5,12,3,19,8,2};
        int max=12;
        int min=10;

        for (int values:numbers){
            if(values< min){
                min=values;
            }

            if(values> max) {
                max = values;
            }
        }

        System.out.println("min=" + min);
        System.out.println("max=" + max);
    }
}
