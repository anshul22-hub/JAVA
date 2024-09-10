import java.util.Scanner;

public class avg_fun {
    
    public static int avgofthreenumber(int a , int b , int c){

        int avg = (a + b + c) / 3;
        return avg;
    }




    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = scn.nextInt();

        System.out.print("Enter b number : ");
        int b = scn.nextInt();

        System.out.print("Enter c number : ");
        int c = scn.nextInt();

        int avg = avgofthreenumber(a, b, c);
        System.out.print("avrage of three number : " + avg);


    }
}
