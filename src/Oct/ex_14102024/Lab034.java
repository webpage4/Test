package Oct.ex_14102024;

public class Lab034 {
    public static void main(String[] args) {
        // GST - 18.45
        int a = 100;
        float gst = 18.45f;
        //Implicit - Narrowing which is not possible
        //int total = a + gst;

        int total = a + (int)gst;
        System.out.println("Loss of data as we did narrowing - explicit typecasting : "+ total);

        float actual = a + gst;
        System.out.println("No data loss as we are using float : "+ actual);

    }
}
