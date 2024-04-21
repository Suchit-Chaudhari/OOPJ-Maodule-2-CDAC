import java.util.Scanner;

public class Q2ReverseHollowTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<3*n; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=2*(n-i); j++){
                if(j == 0 || j == 2*(n-i)-2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
