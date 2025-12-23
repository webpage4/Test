package Oct.ex_10102024;

import org.w3c.dom.ls.LSOutput;

public class Lab013 {
    int i_age;//instance variable
    static int  s_age;//static variable

    public static void main(String[] args) {
        int age;
        age = 100;
        System.out.println(age);
        //System.out.println(i_age); //Instance variable cannot be accessed directly from Static method (main method).
        System.out.println(s_age); //static variable has a by default value of 0(int).

    }

}

