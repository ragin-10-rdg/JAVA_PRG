package week2;

public class ForLoop {

    public static void main(String[] args) {
        for (int i=1; i<=100;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
