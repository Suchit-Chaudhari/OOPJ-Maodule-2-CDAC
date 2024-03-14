import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        year = sc.nextInt();
        if(year%4==0){
            System.out.println(year + " is a Leap Year");
        }
        else{
            System.out.println(year + " is not a Leap Year");
        }


        switch(year%4){
            case 0:
                System.out.println("Leap Year");
            
            default:
                System.out.println("not a leap year");
        }
    }
    
}
