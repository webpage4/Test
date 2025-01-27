package Oct.ex_18102024;

import java.util.Scanner;

public class Lab064_Convertor {
    public static void main(String[] args) {
//        Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
//        Input. -
//        choice - 1 - km → m, km → 1km
//        choice - 2 - f → c, f → c
        Scanner sc = new Scanner(System.in);

        System.out.println("Which unit you would like to convert ?");
        System.out.println("Select 1 for km and m conversions and 2 for Celsius and Fahrenheit conversions");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("Select 1 for m -> km and 2 for km -> m conversion !");
                int y = sc.nextInt();
                switch (y) {
                    case 1:
                        System.out.println("Enter value in meters(m):");
                        float km = sc.nextFloat();
                        double res;
                        res = km / 1000;
                        System.out.println(km + "m = " + res + " km");
                        break;
                    case 2:
                        System.out.println("Enter value in kilometers(km):");
                        float m = sc.nextFloat();
                        res = m / 1000;
                        System.out.println(m + " km = " + res + " m");
                        break;
                    default:
                        System.out.println("You entered invalid number");
                        break;
                }
                break;
            case 2:
                System.out.println("Select 1 for Celsius -> Fahrenheit and 2 for Fahrenheit -> Celsius conversion !");
                int z = sc.nextInt();
                switch (z) {
                    case 1:
                        System.out.println("Enter value in Celsius(C):");
                        float C = sc.nextFloat();
                        double res;
                        res = (C * 1.8) + 32;
                        System.out.println(C + "Celsius = " + res + " Fahrenheit");
                        break;
                    case 2:
                        System.out.println("Enter value in Fahrenheit(F):");
                        float F = sc.nextFloat();
                        res = (F - 32) * (0.555556);
                        System.out.println(F + " Fahrenheit = " + res + " Celsius");
                        break;
                    default:
                        System.out.println("You entered invalid number");
                        break;
                }
                break;
                default:
                System.out.println("You entered invalid number");
                break;
        }


    }

}

