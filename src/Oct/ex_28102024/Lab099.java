package Oct.ex_28102024;

import Nov.ex_07102024.Son;

import javax.xml.transform.Source;

public class Lab099 {
    public static void main(String[] args) {
       StringBuffer strBuff = new StringBuffer("Aditi");
       strBuff.append("Badge");
        System.out.println(strBuff);


       StringBuilder strbuild = new StringBuilder("Aditi");
       strbuild.append("Sharma");
        System.out.println(strbuild);

        //Difference between concatenation and append

        StringBuilder sb = new StringBuilder("aditi");
        sb.append("abc");
        System.out.println(sb);


        String s1 = "Hii";
        String s2 = "aditiii";
        String s3 = s1 + s2; //Creates a new string
        System.out.println(s3);
        System.out.println(s1);

    }
}
