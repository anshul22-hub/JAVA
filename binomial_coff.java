import java.util.Scanner;

public class binomial_coff {

    public static int factorial(int n){

        int fact = 1;
        for(int i = 1; i<=n; i++){

            fact*=i;
            
        }
        return fact;
    }

    public static int binomialcoff(int n , int r){
        
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int bimo = fact_n / (fact_r * fact_nmr);
        return bimo;
    }

    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n number : ");
        int n = scn.nextInt();

        System.out.print("Enter r number : ");
        int r = scn.nextInt();
        
        int fact = binomialcoff(n , r);
        System.out.print("binomial coff is :" + fact);
    }
}
