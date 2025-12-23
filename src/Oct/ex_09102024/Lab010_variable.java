package Oct.ex_09102024;

public class Lab010_variable {
    public static void main(String[] args) {
        int age = 10;//local variable

        {
            int sachin = 100;
            System.out.println(sachin);
        }
        //System.out.println(sachin); -- outside the {}
        System.out.println(age);
    }
         //System.out.println(age); -- outside the {}
}
