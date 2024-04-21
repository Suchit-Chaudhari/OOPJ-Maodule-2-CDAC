import java.util.Scanner;

/**
 * Q5Diamond
 */
public class Q5Diamond {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<=n/2+1; i++){
            for(int j = 1; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=1; j<i; j++){
                System.out.print(j+1);
            }
            
            
            System.out.println();
        }
        // for reversed part
        for(int i=n/2; i>0; i--){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=1; j<i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}