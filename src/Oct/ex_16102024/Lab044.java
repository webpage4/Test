package Oct.ex_16102024;

import java.util.Scanner;

public class Lab044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your name: ");
        String name = scanner.nextLine();
        System.out.println("Please provide your age: ");
        int age = scanner.nextInt();
        System.out.println("Please provide your salary: ");
        int salary = scanner.nextInt();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);


        scanner.close();

    }
}
