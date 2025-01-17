package Oct.ex_18102024;

import java.util.Scanner;

public class Lab057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'A'; // 65
        switch (ch) {
            case 65:
            //case 'A': //65 can also be used
                System.out.println("A");
            default:
                System.out.println("A is char and it has a ASCII value of 65");
        }

//        boolean b = true; //Boolean not allowed in switch
//        switch (b) {
//        }
//
//        long a11 = 30l;
//        switch ((int) a11) {
//        }

//        int a = 98;
//        switch (a) {
//            case 98:
//                System.out.println("98");
//            case 98: //Repeat not allowed ie. same conditions not allowed
//                System.out.println("98");
//        }
    }

}
