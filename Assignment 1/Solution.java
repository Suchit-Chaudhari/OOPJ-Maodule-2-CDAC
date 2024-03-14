import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();
        //Write your logic here
        if(0.0<n1 && n1<1.0 && 0.0<n2 && n2<1.0){
            System.out.println("ture");
        }
        else {
            System.out.println("false");
        }
    }
} 