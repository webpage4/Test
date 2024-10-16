package Oct.ex_17102024;

import javax.swing.*;
import java.util.Scanner;

public class Lab053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of first side of triangle: ");
        float s1 = sc.nextFloat();
        System.out.println("Enter the value of second side of triangle: ");
        float s2 = sc.nextFloat();
        System.out.println("Enter the value of third side of triangle: ");
        float s3 = sc.nextFloat();
        if (s1 == s2 && s2 ==s3 && s1 == s3){
            System.out.println("Triangle is equilateral.");
        } else if (s1==s2 || s2==s3 || s3==s1) {
            System.out.println("Triangle is isosceles.");
        } else if (s1<=0 || s2<=0 || s3 <=0) {
            System.out.println("Invalid Input.");
        } else{
            System.out.println("Triangle is scalene.");
        }
        sc.close();
    }
}
