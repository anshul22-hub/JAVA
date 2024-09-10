import java.util.Scanner;

public class side {
    public static void main(String args []){
        Scanner scn = new Scanner(System.in);
        int side = scn.nextInt();

        int sqe = side * side ;

        System.out.println("area of square "+sqe);
        
    }
}
