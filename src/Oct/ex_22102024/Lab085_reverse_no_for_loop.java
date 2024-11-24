package Oct.ex_22102024;

import java.util.Scanner;

public class Lab085_reverse_no_for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int rev = 0;
        for(;num!= 0;){
            int rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        System.out.println(rev);
    }
}
