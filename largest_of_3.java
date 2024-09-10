import java.util.Scanner;

public class largest_of_3 {
    public static void main (String[] args){
        
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if((a >= b) && (a >= c)){
            System.out.print("a is largest number");
        }

        else if(b >= c){
            System.out.print("b is largest number");
        }

        else{
            System.out.print("c is largext number");
        }

    }
}
