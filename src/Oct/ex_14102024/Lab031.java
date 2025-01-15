package Oct.ex_14102024;

public class Lab031 {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        System.out.println(a%b);
        // Modulus Operator
        // 10 % 12 -> division doesn't complete
        // there is no complete division. -> default

        // = and ==
        int c = 10;
        boolean b1 = (10 == 20); //Comparison 2 values
        System.out.println(b1);

        char a1 = 'A'; //ASCII - 65
        char a2 = 'B'; // 66
        // Rule - concatenation of char -> int calculation
        System.out.println(a1+a2);

        System.out.println('A' == 65);
        System.out.println('B' == 65);

    }
}
