import java.util.Scanner;

public class switch_calculator {
    public static void main (String[] args){
       
        Scanner scn = new Scanner(System.in);

        System.out.println("enter a : ");
        int a = scn.nextInt();

        System.out.println("enter b : ");
        int b = scn.nextInt();
        
        System.out.println("Enter an op");
        char op = scn.next().charAt(0);
    
        switch(op){
            case '+' : System.out.print("addition is " + a+b);
                        break;
            case '-' : System.out.print(a-b);
                        break; 
            case '*' : System.out.print("multiplcaltion is " +a*b);
                        break; 
            case '/' : System.out.print("divide is " +a/b);
                        break;
            case '%' : System.out.print("modulas is "+a%b);
                        break;  
            default : System.out.print("Answer is not found");

        }

    }
}
