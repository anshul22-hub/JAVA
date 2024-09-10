import java.util.Scanner;

public class prime_number {
    public static void main (String[] args){
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if(n == 2){
            System.out.println("n is prime number ");
        }else{
            boolean isprime = true;
            for(int i = 2; i<=Math.sqrt(n); i++){
                if(n % i == 0){
                    isprime = false;
                }
            }
            if(isprime == true){
                System.out.println("n is prime number ");
            }else{
                System.out.print("n is not a prime number");
            }
        }
    }
}
