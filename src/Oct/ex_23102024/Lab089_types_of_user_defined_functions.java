package Oct.ex_23102024;

public class Lab089_types_of_user_defined_functions {
    public static void main(String[] args) {
        // User Defined Functions.

        //  1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type

        // REVOKING FUNCTIONS
        //  1. Without Argument / Parameters and Without Return Type.
        //        for (int i = 0; i < 99; i++) {
        //            greet(); //calling function 100 times
        //        }

        greet();


        //  2. Without Parameters but With Return Type
        greet_with_hello();
        String returned_value = greet_with_hello();
        System.out.println(returned_value);

        // second eg
        age_of_vote();
        int ret_age = age_of_vote();
        System.out.println(ret_age);
//
//
//        int voting_age = age_of_vote();
//        System.out.println(voting_age);
//        if (voting_age >= 18) {
//            System.out.println("You are allowed to vote!");
//        } else {
//            System.out.println("Not Allowed!");
//        }
//
//
//        //  3. With Parameters and Without Return Type ( 90%)
//
        greet_with_your_name("Pramod");
//        greet_with_your_name("Amit");
//        greet_with_your_name("Balaji");
//
//        // greet_with_your_name();
//
        greet_with_first_name_last_name("Aditi","Badge");
//
//
//
//         4. With Parameters and With Return Type
        int result = sum_of_two_number(3,4);
        System.out.println(result);



    }
    //DECLARING FUNCTIONS
    // 1. Without Parameters and Without Return Type. (Declare) /Define
    static void greet() {
        System.out.println("Hi, I am type 1");
    }

    //  2. Without Parameters but With Return Type
    static String greet_with_hello() {
        // Write the code
        System.out.println("Hi, I am Type 2");
        return "Value of return";
    }

    static int age_of_vote() {
        // Write the code
        System.out.println("Vote age Returned!");
        return 18;
    }


    //  3. With Parameters and Without Return Type (void)
    static String name1 ="adt";
    static void greet_with_your_name( String name2) {
        String name3 = name2 + name1;
        System.out.println("Hi Your name is " + name3);

    }

    static void greet_with_first_name_last_name(String firstname,String lastname) {
        System.out.println("Hi Your name is " + firstname +" "+ lastname);
    }


    //  4. With Parameters and With Return Type
    static int sum_of_two_number(int a, int b){
        return a+b;
    }
}
