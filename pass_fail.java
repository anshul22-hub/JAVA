import java.util.Scanner;

public class pass_fail {
    public static void main (String[] args){

        //with the help of ternary operator

        Scanner scn = new Scanner(System.in);
        int mark = scn.nextInt();

        String result = ((mark >= 33)) ? "pass" : "fail";
        System.out.print(result);
    }
}
