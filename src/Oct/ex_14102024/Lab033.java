package Oct.ex_14102024;

public class Lab033 {
    public static void main(String[] args) {
        long p_no = 8888802830l;
        //Implicit
        //short s = p_no; // Invalid

        //Explicit - loss of data
        short s = (short)p_no;
        System.out.println(p_no);
        System.out.println(s);

    }
}
