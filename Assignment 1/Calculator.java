import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int a, b;
        char action;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter action to perform +, -, *, /");
        action = sc.next().charAt(0);

        

        switch (action) {
            case '+':
                System.out.println(a + b);

                
                break;
            case '-':
                System.out.println(a-b);
                break;
            
            case '*':
                System.out.println(a*b);
                break;
            
            case '/':
                System.out.println(a/b);
            default:
                break;
        }
    }

    
}
