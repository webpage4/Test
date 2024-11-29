package Oct.ex_28102024;

public class Lab100_String_methods {
    public static void main(String[] args) {
        String str = "This is a string";

        //Length
        System.out.println("Length of the string is " + str.length());

        //character at specific index
        System.out.println("Character at index 1 is " + str.charAt(1));

        //substring from a string
        System.out.println("Substring of this string is " + str.substring(12));
        System.out.println("Substring of the string with range is " + str.substring(12,15));

        //Checking if string contains a sequence
        System.out.println("Checking if ring is there in string "+ str.contains("ring") );

        //Uppercase & lowercase
        System.out.println("Converting to uppercase " + str.toUpperCase());
        System.out.println("Converting to lower case " + str.toLowerCase());

        //Trimming white spaces from front and end
        String s1 = "   This string has many    white spaces   ";
        System.out.println("Trims white spaces from front and end " + s1.trim());

        //Checking if string is empty
        String s2 = "";
        System.out.println("Is the string empty? " + s2.isEmpty());

        //Checking if the strings are equal
        String s3 = "Aditi";
        String s4  = "Aditi";
        String s5 = "Radha";
        System.out.println("Are strings equal? " + s3.equals(s4));
        System.out.println("Are strings equal? " + s3.equals(s5));

        //Checking if strings are equal (ignoring case)
        String s6 ="Ignoring case";
        System.out.println("Are they exactly same ? " + s6.equalsIgnoreCase("Ignoring case") );
        System.out.println("Are they exactly same ? " + s6.equalsIgnoreCase("not present") );

        //Finding the index of character or substring
        System.out.println("Index of 'n' is " + str.indexOf("n"));
        System.out.println("Index of 'string' is " + str.indexOf("string"));

        //Converting other data types to string
        int num = 100;
        System.out.println("Converting int to string " + String.valueOf(num));

        //Splitting the string
        String s7 = "abc,def,ghi";
        String[] sp = s7.split(",");
        System.out.println("first part " + sp[0]);
        System.out.println("second part "+ sp[1]);
        System.out.println("third part "+ sp[2]);

        //Concatenation of string
        String s8 ="to";
        String s9 = "concatenate";
        System.out.println("Concatenated string " + s8.concat(" -this is added "));
        System.out.println("Adding the symbols " + s8.concat(",").concat(s9).concat("!"));

        //last index of character or substring
        System.out.println("Last index of character " + str.lastIndexOf("i"));
        System.out.println("Last index of string " + str.lastIndexOf("string"));

        //Starts with & Ends with string
        System.out.println("Starts with 'This'? " + str.startsWith("T"));
        System.out.println("Starts with 'This'? " + str.startsWith("This"));
        System.out.println("Ends with 's' ?" + str.endsWith("s"));
        System.out.println("Ends with 'string'?" + str.endsWith("string"));

        //Joining strings with delimiter
        String str_join = String.join("-","27","11","2024");
        System.out.println("This is joined string " + str_join);

        //Matches the regex patterns
        String mail = "abc@gmail.com";
        String mail1 = "$@gmail.com";
        System.out.println("Email matches ? " + mail.matches("^[A-Za-z0-9+_.-]+@(.+)$"));
        System.out.println("Email matches ? " + mail1.matches("^[A-Za-z0-9+_.-]+@(.+)$"));

        //Repeat string
        String rp = "Repeat";
        System.out.println("This is repeating " + rp.repeat(5));

        //Concat string using stringBuilder(efficient for multiple appends)
        StringBuilder sb = new StringBuilder();
        sb.append("this").append("!").append("is").append("*").append("appending");
        System.out.println("Appending stringBuilder " + sb);

        //Subsequence
        System.out.println("Subsequence : " + str.subSequence(1,12));












    }
}
