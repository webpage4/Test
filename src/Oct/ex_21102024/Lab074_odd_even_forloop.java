package Oct.ex_21102024;

public class Lab074_odd_even_forloop {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " -> even");
            }else{
                System.out.println(i+ " -> Odd");
            }

        }
    }
}
