package Oct.ex_10102024;

public class Lab017_Character_Literals {
    public static void main(String[] args) {
        //Character literals
        int c1 = 'A';
        int c2 = '@';

        //Escape Character
        char add = '$';
        char symbol = '@';
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("New line --"+"Aditi" + new_line+ add + c2 + "Badge");
        System.out.println("Tab line --"+"Aditi" + tab_line + symbol + "Badge");
        System.out.println("Back space (deletes previous letter)--"+"Aditi" + back_space + "Badge");
        System.out.println("It moves the cursor to the beginning of the line --"+"Aditi" + carriage_return + "Badge");

    }
}
