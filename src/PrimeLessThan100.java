import java.util.Scanner;

public class PrimeLessThan100 {
    public  static boolean isPrime(int number) {
        if(number<=1) return false;
        for(int i = 2; i <=Math.sqrt(number); i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 2;
        //Kiem tra va in ra
        while(num < 100){
            if(isPrime(num)){
                System.out.println(num);
            }
            num++;
        }
    }
}
