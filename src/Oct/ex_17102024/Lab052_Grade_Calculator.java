package Oct.ex_17102024;

import java.util.Scanner;

public class Lab052_Grade_Calculator {
    public static void main(String[] args) {

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
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Give your score and grade will be displayed: ");
//        float score = sc.nextFloat();
//        char grade = 'x';
//        if(score>=90 && score<=100){
//            grade = 'A';
//        } else if (score>=80 && score<=89) {
//            grade = 'B';
//        } else if (score>=70 && score<=79) {
//            grade = 'C';
//        }
//        else if (score>=60 && score<=69){
//            grade = 'D';
//        } else if (score>=0 && score<=59) {
//            grade = 'F';
//        }
//        else{
//            System.out.println("You have entered invalid score.");
//        }
//        System.out.println("Your grade is " + grade);
//        sc.close();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = scanner.nextInt();
        char grade = 'x';
        if (marks>=90 && marks<=100){
            grade = 'A';
        }
        else if (marks>=80 && marks<=89){
            grade = 'B';
        }
        else if (marks>=70 && marks<=79){
            grade = 'C';
        }
        else if (marks>=60 && marks<=69){
            grade = 'D';
        }
        else if (marks>=0 && marks<=59){
            grade = 'F';
        }
        else{
            System.out.println("You have entered invalid marks");
        }
        System.out.println("Your grade is: "+ grade);

        scanner.close();

    }
}
