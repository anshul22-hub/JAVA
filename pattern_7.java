import java.util.Scanner;

public class pattern_7 {

    public static void  hollow_rect( int row , int col){

        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=col; j++){
                if(i == 1 || i == row || j == 1 || j == col){// importent line 
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }


    public static void main(String[] args){

        hollow_rect(7, 5);
    }
}
