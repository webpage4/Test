package Oct.ex_14102024;

public class Lab032_Typecasting {
    public static void main(String[] args) {
        // Type Casting
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with data type), loss

        //Widening - Converting small datatype to large
        byte b = 10;
        int a = b; // Valid -> Implicit Casting - JVM
        int a1 = (int)b; // Valid -> Explicit Casting - JVM

        //Narrowing - Converting large datatype to small
        int v = 200;
        //byte b1 = v; // Invalid - Implicit Casting - JVM
        byte b2 = (byte)v; // Valid -> Explicit Casting - User - In this case data will overflow

    }
}
