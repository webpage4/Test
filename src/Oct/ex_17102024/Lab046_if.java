package Oct.ex_17102024;

import java.util.Scanner;

public class Lab046_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("yes you can vote");
        }
        else {
            System.out.println("NO you cannot vote");
        }
        sc.close();
    }
}