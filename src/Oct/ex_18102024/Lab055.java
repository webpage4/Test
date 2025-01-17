package Oct.ex_18102024;

import java.util.Scanner;

public class Lab055 {
    //public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> execute chrome
        // firefox -> execute of firefox
        // edge -> edge browser cases.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which browser you would like to prefer?");
        String browser = scanner.nextLine();
        browser = browser.toLowerCase(); //it will take upper case as well as lower case

        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC");
                break;

            case "firefox":
                System.out.println("Starting the firefox");
                System.out.println("........");
                System.out.println("TC");
                break;

            case "opera":
                System.out.println("Starting the opera");
                System.out.println("........");
                System.out.println("TC");
                break;

            default:
                System.out.println("The browser you selected isn't available OR Do check if it's a typo.");
                break;
        }

    }

}
