package Oct.ex_23102024;

import java.util.Scanner;

public class Function_cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication,and 4 for division: ");
        int ch = sc.nextInt();
        double res = 0;
        if (ch==1){
            add(a,b);
            res = add(a,b);
            System.out.println("Addition is :" + res);
        }
        else if (ch==2) {
            sub(a,b);
            res = sub(a,b);
            System.out.println("Subtraction is :" + res);
        } else if (ch==3) {
            mul(a,b);
            res = mul(a,b);
            System.out.println("Multiplication is :" + res);
        } else if (ch==4) {
            div(a,b);
            res = div(a,b);
            System.out.println("Division is :" + res);
        }else {
            System.out.println("Invalid input.");
        }

    }
    //DECLARATION
    static int add(int a, int b){
        return a+b;
    }

    static int sub(int a, int b){
        if (a>b){
            return a-b;
        }
       else{
            return b-a;
        }
    }

    static int mul(int a, int b){
        return a*b;
    }

    static double div(int a, int b){
        if (a==0||b==0){
            System.out.println("Not possible");
            return 0;
        }
        else {
            return (a/b);
        }
    }
}
