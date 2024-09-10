import java.util.Scanner;

public class pattern_4 {
    public static void main (String[] args){
        
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 1; i<=n; i++){
            int max = 1; 
            for(int j = 1; j<=i; j++){

                System.out.print(max + "\t");
                max++;
            }

            System.out.println();
        }
    }
}
