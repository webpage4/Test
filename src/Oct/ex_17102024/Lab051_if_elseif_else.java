package Oct.ex_17102024;

import java.util.Scanner;

public class Lab051_if_elseif_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd num: ");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("num1>num2");
        } else if (num1<num2) {
            System.out.println("num2>num1");
        }
        else {
            System.out.println("Equal");
        }
        sc.close();
    }
}
