package week2;

public class primenumber {
    public static void main(String[] args) {
        int num=1;
        boolean isPrime=true;

        for (int i=2;i<19;i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("prime number");
        }else{
            System.out.println("not prime number");
        }
    }
}
