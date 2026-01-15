package Oct.ex_15102024;

import java.util.Scanner;

public class Lab039_Ternary_operator {
    public static void main(String[] args) {
        // Ternary Operator
        // - result = condition ? expression1 : expression2;
        // Result = condition ? if yes then first expression: else expression 2
        Scanner Scanner = new Scanner(System.in);
        int num = 5;
        String res = num>0 ? "Positive" : "Negative";
        System.out.println("The number is " + res);


//        int age = 21;
//        String vote = age>18 ? "Allowed to vote" : "Not allowed to vote";
//        System.out.println(vote);

        //Nested ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        //If the score is 90 or above, the grade will be "A".
        //If the score is between 80 and 89, the grade will be "B".
        //If the score is between 70 and 79, the grade will be "C".
        //If the score is between 60 and 69, the grade will be "D".
        //If the score is below 60, the grade will be "F".


        System.out.println("Enter your marks: ");
        int mar = Scanner.nextInt();
        String grade = (mar>=90 && mar<=100) ? "A" :(mar<90 && mar>=80) ? "B" : (mar<80 && mar>=70)? "C": (mar<70 && mar>=60) ? "D" : (mar<60 && mar>=0) ? "F" : "Marks entered are invalid";
        System.out.println("Your grade is: " + grade);

    }
}
