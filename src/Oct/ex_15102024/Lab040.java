package Oct.ex_15102024;

public class Lab040 {
    public static void main(String[] args) {
        int a = 10;
        int b= 20;
        int c= 30;
        String max = (a>b && a<c)?"a":(b>a && b>c)?"b":(c>a && c>b)?"c":"none";
        System.out.println("Max no "+ max);

    }
}
/**
int score = 90;
String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        System.out.println("Your Grade is -> " + grade);
        System.out.printf("Your Grade is %s", grade);
 **/