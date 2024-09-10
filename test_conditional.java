import java.util.Scanner;

public class test_conditional {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("enter a number : ");
        int n = scn.nextInt();

        if(n > 0){
            System.out.println("number is positive");
        }
        else{
            System.out.println("number is negative");
        }

        // question 2

        double temp = 99;

        if(temp >= 100){
            System.out.print("you have a fever");
        }
        else{
            System.out.print("you don't have a fever");
        }

    }
}
