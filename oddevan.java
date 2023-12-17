/**
 * advance
 */
public class advance {

    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n; i++){
            for(int j=1;j<=i; j++){
               // int sum 
                int sum = i+j;
                if(sum %2 ==0){
               System.out.print("0"+ " "); // ODD
                } else {
                    System.out.print("1"+" "); //EVAN
                }
            }
            System.out.println();
        }
    }
}