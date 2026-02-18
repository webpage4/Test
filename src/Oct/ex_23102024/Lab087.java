package Oct.ex_23102024;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {

        greet();


        // Code 10,000


        greet();

        // Code 10,000


        add();


    }
    static void greet(){
        System.out.println("Greeting youuuu");
    }
    static void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give value of a: ");
        int a = sc.nextInt();
        System.out.println("Give value of b: ");
        int b = sc.nextInt();
        int res=0;
        res=a+b;
        System.out.println("Sum: "+res);
    }

}
