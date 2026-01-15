package Oct.ex_11102024;

public class Lab019_Assignment_operator {
    public static void main(String[] args) {
        int abc = 10;
        System.out.println(abc);
        // = -> assignment operator
        // RHV to the LH
        // Arithmetic Operators
//        + (Addition)
//        - (Subtraction)
//        * (Multiplication)
//        / (Division)
//        % (Modulo) | Modulus - Remainder
        int a = 20;
        int b = 10;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);


        a+=1;
        System.out.println(a);
        a-=1;
        System.out.println(a);
        a/=2;
        System.out.println(a);
        a*=3;
        System.out.println(a);
        a%=4;
        System.out.println(a);
    }
}
