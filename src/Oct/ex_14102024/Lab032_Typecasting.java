package Oct.ex_14102024;

public class Lab032_Typecasting {
    public static void main(String[] args) {
        // Type Casting
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with data type), loss

        // Widening - Converting small datatype to large
        //Widening -small to large possible both implicitly and explicitly without any loss of data
        byte b = 10;
        int a = b; //Implicit - indirectly - JVM
        int a1 = (int)b; //Explicit - directly - JVM


        //Narrowing - Converting large datatype to small
        //Narrowing -large to small possible only explicitly that too with loss of data
        int i = 200;
        // byte b1 = i; Implicit - Invalid - JVM
        byte b1 = (byte)i; // Explicit - User - Valid - data overflow - loss of data
        System.out.println(b1);

    }
}
