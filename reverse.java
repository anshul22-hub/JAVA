import java.util.Scanner;

public class reverse {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // reverse of number 

        /*while(n > 0){
            int rem = n % 10;
            n = n / 10;
            System.out.print(rem);
        }
        System.out.println();*/

        // reverse of given number 
        
        int rev = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            rev = rev * 10 + rem;
            //System.out.print(rev);
        }
        System.out.print(rev);
    }
}
