import java.util.Scanner;

public class leap_year {
    public static void main (String[] args){
        
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();

        if(year % 4 == 0){
            System.out.print("year is leap year");
        }
        else if(year % 100 == 0){
            System.out.print("year is not leap year");
        }
        else if(year % 400 == 0){
            System.out.print("year is  leap year");
        }
        else{
            System.out.print("year is not leap year");;
        }
    }
}
