import java.util.Scanner;

public class pattern_2 {
    public static void main (String[] args){
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scn.nextInt();

        for(int i = 1 ; i <= n; i++){ // for how many  line 

            for(int k = 1; k<=i; k++){ // for star 

                System.out.print("*");
            }
            
            System.out.println(); // for space
        }
    }
}
