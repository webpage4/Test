package Oct.ex_16102024;

public class Lab042_Argument_console {
    public static void main(String[] args) {

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.printf("%s , %s ,%s", args[0], args[1], args[2]);
        int age = Integer.parseInt(args[1]);
        System.out.println();
        System.out.println(age > 25 ? "Allowed to Goa" : "Not Allowed");
    }
}
