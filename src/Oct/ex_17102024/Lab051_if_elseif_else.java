package Oct.ex_17102024;

import java.util.Scanner;

public class Lab051_if_elseif_else {
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
        } else if(a==b){
            System.out.println("Both are equal with value " + a);
        }
        else {
            System.out.println("The input you have given is invalid");
        }
        scanner.close();

    }
}
