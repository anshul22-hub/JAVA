import java.util.Scanner;

public class largest_of_2 {
    public static void main (String[] args){
        
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        if(a >= b){
            System.out.print("a is largest number");
        }

        else{
            System.out.print("b is largest number ");
        }

    }
}
