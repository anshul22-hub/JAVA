public class decimal {

    public static void dectobin(int n){
        int num = n;
        int p = 0;
        int bin = 1;
        while(n!=0){
            int rem = n % 2;
            n = n / 2;
            bin = bin + (rem * (int)Math.pow(10 , p));
            p++;
        }
        System.out.print("binary of " + num + " = " + bin);
    }

    public static void main(String[] args){

       dectobin(19);

    }
}
