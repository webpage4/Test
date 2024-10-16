package Oct.ex_16102024;

import java.util.Scanner;

public class Lab045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        int max = (num1>num2)?num1:num2;
        System.out.println("Maximum number is "+ max);

        scanner.close();

    }
}
