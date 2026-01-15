package Oct.ex_16102024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab044 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please provide your name: ");
    String name = scanner.nextLine();
    System.out.println("Please provide your age: ");
    int age = scanner.nextInt();
    System.out.println("Please provide your salary: ");
    double salary = scanner.nextDouble();
    System.out.println("Please provide your phone number: ");
    long pno = scanner.nextLong();
    System.out.println("Name: "+ name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
    System.out.println("Phone no: " + pno);

    scanner.close();
}
}
