package Oct.ex_28102024;

public class Lab098 {
    public static void main(String[] args) {
        String abc = "Niagara. O roar again!";
        String roar = abc.substring(11, 15); // substring(start index ,end index - 1 )
        System.out.println(roar);

        // substring - many interviews
        String s1 = "Aditi";
        String s2 = s1.concat("Badge --this is concatenation"); //s1.concat(whatever you want to add)
        System.out.println(s2);
        // using +
        String s3 = "This ";
        String s4a = "is ";
        String s5a = "also concatenation";
        String result = s3 + s4a + s5a;
        System.out.println(result);


        String fruits = "apple,banana,cherry"; // delimter = ,
        String[] split_fruits = fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);

        String fruits2 = "ABC-XYZ-QWE"; // delimter = ,
        String[] split_fruits2 = fruits2.split("-");
        System.out.println(split_fruits2[0]);
        System.out.println(split_fruits2[1]);
        System.out.println(split_fruits2[2]);


        String s4 = "Pramod";
        System.out.println(s4.charAt(0));
        //System.out.println(s4.charAt(10)); //StringIndexOutOfBoundsException

        String s5 = " Pramod ";
        System.out.println(s5.trim());

        String s6 = "Pramod";
        System.out.println(s6.indexOf("r"));
        System.out.println(s6.indexOf("d"));

        String s7 = "Pramod";
        System.out.println(s7.contains("ra"));
        System.out.println(s7.contains("zy"));

        String s8 = "Pramoddutta";
        System.out.println(s8.lastIndexOf("d"));

        String s9 = "Pramoddutta";
        System.out.println(s9.replace("d","z"));
        System.out.println(s9.replaceAll("d","z"));

        String s10 = "Pramodduttaji";
        System.out.println(s10.startsWith("Pra"));
        System.out.println(s10.endsWith("ji"));
        System.out.println(s10.endsWith("zy"));



        String original = "banana";
        String result1 = original.replace('a', 'o');
        System.out.println(result1);

        String original1 = "Hello123 World456!";
        String result2 = original1.replaceAll("\\d+", "-");
        System.out.println(result2);


        String result3 = original1.replaceAll("o", "O");
        System.out.println(result3);
    }
}
