package Oct.ex_18102024;

import java.util.Scanner;

public class Lab055 {
    public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> execute chrome
        // firefox -> execute of firefox
        // edge -> edge browser cases.
        Scanner sc = new Scanner(System.in);
        System.out.println("Which browser you prefer?");
        String browser = sc.next();
        browser = browser.toLowerCase();
        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC");
                break;
            case "edge":
                System.out.println("Starting the edge");
                System.out.println("........");
                System.out.println("TC");
                break;
            case "firefox":
                System.out.println("Starting the firefox");
                System.out.println("........");
                System.out.println("TC");
                break;
            default:
                System.out.println("No this option isn't available OR do check if it's a typo.");
                break;
        }
    sc.close();

    }
}
