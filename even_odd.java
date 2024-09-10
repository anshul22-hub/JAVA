import java.util.Scanner;

public class even_odd {
    public static void main (String[] args){
        
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        if(a % 2 == 0){
            System.out.print("number is even");
        }

        else{
            System.out.print("number is odd");
        }

    }
}
