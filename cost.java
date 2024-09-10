import java.util.Scanner;

public class cost {
    public static void main(String args []){
        Scanner scn = new Scanner(System.in);
        float pencil = scn.nextFloat();
        float pen = scn.nextFloat();
        float eraser = scn.nextFloat();

        float bill = pencil + pen + eraser ;

        System.out.println("total bill "+bill);
        
        //add 18% tex
        float total = bill + (0.18f * bill);
        System.out.println("total tex "+total);
    }
}
