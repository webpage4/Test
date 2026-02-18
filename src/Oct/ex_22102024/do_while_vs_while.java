package Oct.ex_22102024;

public class do_while_vs_while {
    public static void main(String[] args) {
        //WHILE -- Entry controlled loop - does not execute if condition is false
        int a = 0;
        while (a<0){
            System.out.println("While"+a);
            a++;
        }
        //DO WHILE -- Exit controlled loop - executes at least once
        int b = 0;
        do {
            System.out.println("Do While "+b);
            b++;
        }while (b<0);
    }
}
