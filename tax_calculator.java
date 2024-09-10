import java.util.Scanner;

public class tax_calculator {
    public static void main (String[] args){
        
        Scanner scn = new Scanner(System.in);
        int income = scn.nextInt();
        int tax;

        if(income < 200000){
            tax = 0;
        }

        else if(income >= 200000 && income <= 700000){
            tax = (int) (income * 0.2);
        }

        else{
            tax = (int) (income * 0.3);
        }
        System.out.print("Your tax is : " + tax);
    }
}
