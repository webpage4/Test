package Oct.ex_14102024;

public class Lab033 {
    public static void main(String[] args) {

        long p_no = 8888802830l;
        //short a = p_no; Implicit - Invalid
        short a = (short)p_no; // Explicit - data overflow - loss of data
        System.out.println(a);
        System.out.println(p_no);


    }
}
