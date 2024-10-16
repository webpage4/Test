package Oct.ex_17102024;

import java.util.Scanner;

public class Lab050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
        sc.close();
    }
}
