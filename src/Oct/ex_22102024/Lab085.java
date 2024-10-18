package Oct.ex_22102024;

import java.util.Scanner;

public class Lab085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        int rev = 0;
        for (int num = sc.nextInt(); num>0 ;rev  = num/10 ){
            rev = rev*10 +rev;
            System.out.println(rev);
        }
    }
}
