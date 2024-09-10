import java.util.Scanner;

public class sum_nuturalnumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        
       /*  while(i <= n){
            sum = sum + i; 
            i++;
        }*/
        
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("sum of n natural number is : " +sum);
    }
}
