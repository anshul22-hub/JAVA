import java.util.*;

public class factorial {
    public static void main (String[] args){
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int fact = 1;

        for(int i = 1; i<=n; i++){

            fact*=i;
        }
        
        System.out.println("factorial is :" +fact);
    }
}
