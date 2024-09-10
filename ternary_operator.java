import java.util.Scanner;

public class ternary_operator {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //ternary operator

        String type = ((n % 2) == 0) ? "even" : "odd";
        System.out.print(type);
    }    
}
