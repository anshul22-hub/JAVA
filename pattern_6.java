public class pattern_6 {

    public static void invertedhalfpyramid(int n){
        int st = n;
        int sp = -1;

        for(int i = 1; i<=n; i++){
            for(int j = 1;j <= st;j++){
                System.out.print(j + " ");
            }
            for(int j = 1; j<=sp; j++){
                System.out.print(" ");
            }
            
            sp++;
            st--;
            System.out.println();
        }
    }
    public static void main(String[] args){

        invertedhalfpyramid(9);
    }
}
