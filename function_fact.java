import java.util.Scanner;

public class function_fact {

    public static int factorial(int n){

        int fact = 1;
        for(int i = 1; i<=n; i++){

            fact*=i;
            
        }
        return fact;
    }


    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n number : ");
        int n = scn.nextInt();

        int fact = factorial(n);
        System.out.print("Factorial is :" + fact);

    }
}
