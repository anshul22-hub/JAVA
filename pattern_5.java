import java.util.Scanner;

public class pattern_5 {
    public static void main (String[] args){
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        char ch = 'A'; // for charecter we use char
        
        for(int i = 1; i<=n; i++){

            for(int j = 1; j<=i ; j++){

                System.out.print(ch + "\t");
                ch++;
            }

            System.out.println();

        }
    }
}
