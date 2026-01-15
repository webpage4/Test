package Oct.ex_15102024;

public class Lab037_Decrement {
    public static void main(String[] args) {
        // PRE  decrement - ++operand.
        // value is decremented first and then stored in the result.
//        int a_pre = 10;
//        int b = --a_pre;
//        System.out.println(b);
//        System.out.println(a_pre);

        // Method
        // Line No. | Exp(result)  |  a
        //   5    | NA |10
        //   6    | 9 | 9

        // POST decrement  = Print first and then decrease
        int a_post = 10;
        int c = a_post--;
        System.out.println(c);
        System.out.println(a_post);


        // Line No. | Exp  |  a
        //  5       |  10    |  9
        //  6       |  result = 10   |  9
        //  7       |  result = 10   |  9


    }
}
