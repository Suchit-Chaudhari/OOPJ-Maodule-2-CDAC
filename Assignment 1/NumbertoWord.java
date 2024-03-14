import java.util.Scanner;

class NumberToWord{
    
    public static void main(String args[]){
        int grade;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numerical Grade: ");
        grade = sc.nextInt();
        
        if(grade>=90) {
            System.out.println("Grade A+");
        }
        else if(grade>=80){
            System.out.println("Grade A");
        }
        else if(grade>=70) {
            System.out.println("Grade B+");

        }
        else if(grade>=60) {
            System.out.println("Grade B");
        }
        else if (grade>=50) {
            System.out.println("Grade C");

            
        }
        else {
            System.out.println("Grade D");
        }
    }   
}