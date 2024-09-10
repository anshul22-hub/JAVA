import java.util.Scanner;

public class pattern_3 {
    public static void main (String[] args){
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // 1st method
        for(int i = 1; i<=n; i++){

            for(int j= 1; j<=n-i+1 ;j++){

                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd method
        for(int i = n; i >= 1; i--){

            for(int j = 1;j<=i;j++){

                System.out.print("*");
            }

            System.out.println();
        }
    }
}
