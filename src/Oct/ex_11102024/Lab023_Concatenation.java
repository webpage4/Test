package Oct.ex_11102024;

public class Lab023_Concatenation {
    public static void main(String[] args) {
        String first_name = "Pramod";
        String last_name = "Dutta";
        int a = 10;
        int b = 10;
        System.out.println(first_name + last_name + a + b);
        // PramodDutta1010 - first operator is string so  - Concatenation will be followed
        //Left to right
        System.out.println(a + b + first_name + last_name);
        // First operator is int  + mathematics rules will be followed -> 20PramodDutta
        System.out.println(first_name + last_name + (a + b));
    }
}
