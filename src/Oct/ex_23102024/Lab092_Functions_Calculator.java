package Oct.ex_23102024;

import java.util.Scanner;

public class Lab092_Functions_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int a = sc.nextInt();
        System.out.println("Please enter the second number:");
        int b = sc.nextInt();
        sum(a,b);
        int addition = sum(a,b); // store return
        System.out.println("Addition = " + addition); //print the stored value
        sub(a,b);
        int subtraction = sub(a,b);
        System.out.println("Subtraction = " + subtraction);
        mul(a,b);
        int multiplication = mul(a,b);
        System.out.println("Multiplication = "+ multiplication);
        int division = div(a,b);
        System.out.println("Division = " + division);

    }

    static int sum(int a, int b) {
      return a+b;
    }
    static int sub(int a , int b){
            return b-a;
    }
    static int mul(int a ,int b){
        return a*b;
    }
    static int div(int a, int b){
        if (a>b){
            return a/b;
        }
        else{
            return b/a;
        }
    }

}
