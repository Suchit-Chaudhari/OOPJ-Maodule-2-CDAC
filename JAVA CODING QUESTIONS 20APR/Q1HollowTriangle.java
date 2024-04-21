import java.util.Scanner;

/**
 * HollowTriangle
 */
public class Q1HollowTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            
            for(int j=0; j<2*i-1; j++){
                if(j == 0 || j == 2*i-2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            // for(int k=0; k<2*i-1; k++){
            //     System.out.print(" ");
            // }
            // if(i!=0){
            //     System.out.print("*");
            // }
            System.out.println();
        }
        for(int i=0; i<3*n; i++){
            System.out.print("*");
        }
    }
    

}