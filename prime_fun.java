import java.util.Scanner;

public class prime_fun {
    public static boolean isprime(int n){

        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n % i == 0){ // for dividing
                return false;
            }
        }
        return true;
    }

    public static void primeinrange(int n) {
        for(int i = 2; i<=n; i++){
            if(isprime(i)){
                System.out.print(i + " ");
            }
            //System.out.println();
        }
    }



    public static void main (String[] args){

        primeinrange(290);
    }
}
