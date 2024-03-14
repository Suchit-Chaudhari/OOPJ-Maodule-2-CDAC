import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        ch = sc.next().charAt(0);

        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {

            System.out.println("Entered character is vowel");
            
        }
        else {
            System.out.println("Entered character is consonant");
        }

    }
    
}
