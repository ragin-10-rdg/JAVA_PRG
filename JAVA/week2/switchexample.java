package week2;

public class switchexample {
    public static void main(String[] args){
        String dayname="wednesday";

        switch (dayname){
            case "sunday":
                System.out.println("day is sunday");
                break;
            case "monday":
                System.out.println("day is monday");
                break;
            case "tuesday":
                System.out.println("day is tuesday");
                break;
            default:
                System.out.println("some other day");
        }

        switch (dayname) {
            case "sunday" -> System.out.println("day is sunday");
            case "monday" -> System.out.println("day is monday");
            case "tuesday" -> System.out.println("day is tuesday");
            default -> System.out.println("some other day");
        }

        String res = switch (dayname) {
            case "sunday" -> "day is sunday";
            case "monday" -> "day is monday";
            case "tuesday" -> "day is tuesday";
            default -> "some other day";
        };
        System.out.println("final result 2=" + res);

        String result = "";
        switch(dayname) {
            case "sunday" -> result = "day is sunday";
            case "monday" -> result = "day is monday";
            case "tuesday" -> result = "day is tuesday";
            default -> result = "some another day";
        }
        System.out.println("final results=" + result);

        String res3 = switch (dayname) {
            case "sunday":
                yield "day is sunday";
            case "monday":
                yield "day is monday";
            case "tuesday":
                yield "day is tuesday";
            default:
                yield "some other day";
        };
        System.out.println("final results=" + res3);

    }
}
