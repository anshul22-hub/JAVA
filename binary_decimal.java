import java.util.Scanner;

public class binary_decimal {

    public static void bintodec (int n){
        int num = n;
        int p = 0;

        int decnum = 0; 

        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            decnum = decnum + (rem * (int)Math.pow(2 , p)); //because of type casting
            p++;
        }
        System.out.print("decimal of " + num + " = " + decnum);

        
    }

    public static void main(String[] args){
        bintodec(1010);
    }
}
