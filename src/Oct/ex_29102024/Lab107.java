package Oct.ex_29102024;

import java.util.Scanner;
//User Input Array
public class Lab107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length ; i++) {
            System.out.printf("Enter the number %d :", (i+1));
            numbers[i] = sc.nextInt();
        }
        System.out.println("--------------");
        System.out.println("Numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
