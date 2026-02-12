package Oct.ex_21102024;

public class Lab065 {
    public static void main(String[] args) {
        // Initialization -> Condition -> Updation(Incre/decre)
        for (int i = 0;i < 10; i++){
            System.out.println(i);
        }
        System.out.println("First loop ended");
        for (int i = 1; i <=10 ; ++i) {//pre- or post-increment it will not matter as we are using i in next command
            System.out.println(i);
        }

    // i = 0 then i< 10
    // i = 1 then i<= 10
    //BOTH WILL ITERATE 10 TIMES
    }
}
