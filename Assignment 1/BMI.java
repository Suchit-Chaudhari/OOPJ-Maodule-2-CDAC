import java.util.Scanner;


public class BMI {
    public static void main(String[] args) {
        float height, weight, BMI;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Height: ");
        height = sc.nextFloat();

        System.out.println("Enter Weight");
        weight = sc.nextFloat();

        BMI = weight / (height * height);


        if(BMI<18.5) {
            System.out.println("You are underweight");
        }

        else if(BMI>18.5 && BMI<25){
            System.out.println("You have normal weight");

        }

        else {
            System.out.println("you are overweight");
        }
    }
    
}
