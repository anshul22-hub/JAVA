public class test_operator2 {
    public static void main (String[] args){
        
        // 2 question
        
        int x = 200;
        int y = 50;
        int z = 100;

        if(x > y && y > z){
            System.out.println("hello");
        }

        if(z > y && z < x ){
            System.out.println("java");
        }

        if((y +100) < x && (y + 150) < z){
            System.out.println("hello java");
        }
        
        // 4 question

        int  a = 10 ;
        int  b = 5;

        int exp1 = (b * (a / b + a / b));
        int exp2 = ((b * a / b + b * a / b));

        System.out.println(exp1);
        System.out.println(exp2);

    }
}
