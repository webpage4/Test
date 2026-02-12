package Oct.ex_18102024;

import java.util.Scanner;

public class Lab058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // JDK>13 only
        System.out.println("Enter the item code: ");
        int itemcode = sc.nextInt();

        switch (itemcode) {
            case 001, 002, 003:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004, 005, 006:
                System.out.println("This is Mechanical devices");
                break;
            case 007:
                System.out.println("Something else");
            default:
                System.out.println("None");
        }
    }
}
