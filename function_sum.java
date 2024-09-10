import java.util.Scanner;

public class function_sum {

    public static int sumofnumber(int a , int b){
        //int sum = a + b;
        return a+b; 
    }

    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int sum = sumofnumber(a, b);
        System.out.print("sum is :" + sum);
    }
}
