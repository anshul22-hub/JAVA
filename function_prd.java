import java.util.Scanner;

public class function_prd {

    public static int productofnumber(int a , int b){
        int prd = a * b;
        return prd;
    }

    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = scn.nextInt();

        System.out.print("Enter b number : ");
        int b = scn.nextInt();

        int prd = productofnumber(a, b);
        System.out.print("product of two number : " + prd);

    }
}
