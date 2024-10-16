package Oct.ex_17102024;

import javax.swing.*;
import java.util.Scanner;

public class Lab052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ✅ Grade Calculator:
        // Write a program that calculates and displays the letter grade
        // for a given numerical score (e.g., A, B, C, D, or F)
        // based on the following grading scale:
        //
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        // Logic Building - Java

        // Step 1
        // Find the inputs / outputs
        // Input | score -> (0 - 100) -> data type -> int
        // Output | grade -> data type -> char


        // 2. Basic Logic |  Rough Logic
        // if ( score >= 90 && score <= 100 ) -> return or print grade - A
        // else if score <=89 && score >= 80 -> return or print grade - B
        // else if score <=79 && score >= 70 -> return or print grade - C
        // D,E
        //  // else -> grade -> F


        // 3. Write the code
        System.out.println("Give your score and grade will be displayed: ");
        float score = sc.nextFloat();
        char grade = 'x';
        if(score>=90 && score<=100){
//            System.out.println("A");
            grade = 'A';
        } else if (score>=80 && score<=89) {
//            System.out.println("B");
            grade = 'B';
        } else if (score>=70 && score<=79) {
//            System.out.println("C");
            grade = 'C';
        }
        else if (score>=60 && score<=69){
//            System.out.println("D");
            grade = 'D';
        } else if (score>=0 && score<=59) {
//            System.out.println("F");
            grade = 'F';
        }
        else{
            System.out.println("You have entered invalid score.");
        }
        System.out.println("Your grade is " + grade);
        sc.close();
    }
}
