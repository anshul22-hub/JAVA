import java.util.*;

public class avg {
    public static void main(String args []){
        Scanner scn = new Scanner(System.in);
        int a  = scn.nextInt();
        int b = scn.nextInt();
        int c  = scn.nextInt();

        int avg = (a + b + c) / 3;


        System.out.println("Average of three number "+avg); 
    }
}
