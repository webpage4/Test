package Oct.ex_18102024;

public class Lab060 {
    public static void main(String[] args) {
        int a = 11;
        switch (-1){  //Negative switch cases are allowed
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
        }
    }
}
