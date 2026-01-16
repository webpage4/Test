package Oct.ex_17102024;

import java.util.Scanner;

public class Lab051_if_elseif_else {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter 1st num: ");
//        int num1 = scanner.nextInt();
//        System.out.println("Enter 2nd num: ");
//        int num2 = scanner.nextInt();
//        if(num1>num2){
//            System.out.println("num1>num2");
//        } else if (num1<num2) {
//            System.out.println("num2>num1");
//        }
//        else {
//            System.out.println("Equal");
//        }

//        System.out.println("Enter first number: ");
//        int a = scanner.nextInt();
//        System.out.println("Enter second number: ");
//        int b = scanner.nextInt();
//        if (a>b){
//            System.out.println("a is maximum");
//        } else if (a==b) {
//            System.out.println("Both are equal");
//
//        }
//        else if(b>a){
//            System.out.println("b is maximum");
//        }
//        else {
//            System.out.println("You have entered invalid inputs");
//        }
//        scanner.close();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int a = scanner.nextInt();
        System.out.println("Give the second number:");
        int b = scanner.nextInt();
        if (a>b){
            System.out.println("The first number is greater which is " + a);
        } else if (a<b) {
            System.out.println("The second number is greater which is " + b);
        }else if(a==b){
            System.out.println("Both are equal");
        }
        else {
            System.out.println("The input you have given is invalid");
        }
        scanner.close();

    }
}
