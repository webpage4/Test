package Oct.ex_18102024;
import java.util.Scanner;

public class Lab062_Calculator_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//  Create a simple calculator that performs addition, subtraction, multiplication, and division, modulus based on user input using switch statements.
//  Inputs :   num 1, num 2, +
//  Output :  num1+num2 → print information.

        System.out.println("Please enter 1 for Addition, 2 for Subtraction, 3 for multiplication & 4 for modulus:");
        int op = sc.nextInt();
        System.out.println("Enter value of first number: ");
        float a = sc.nextFloat();
        System.out.println("Enter value of second number: ");
        float b = sc.nextFloat();
        float res = 0;

        switch(op){
            case 1:
                res = a+b;
                System.out.println("Addition = " + res);
                break;
            case 2:
                if (a>=b){
                    res= a-b;
                }
                else {
                    res = b-a;
                }
                System.out.println("Subtraction = "+ res);
                break;
            case 3:
                res=a*b;
                System.out.println("Multiplication= "+ res);
                break;
            case 4:
                if(a>=b){
                    res= a%b;
                }
                else {
                    res = b%a;
                }
                System.out.println("Modulus = "+ res);
                break;
            default:
                System.out.println("You have selected a invalid choice");
                break;

        }

    }
}
