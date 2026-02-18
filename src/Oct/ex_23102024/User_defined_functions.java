package Oct.ex_23102024;

public class User_defined_functions {

    public static void main(String[] args) {
        //calling first function
        funct1();
        System.out.println("-----");

        //calling second function
        int sum =funct2();
        int aaa = sum+3;
        System.out.println(aaa+ " this is using the return value");
        System.out.println(sum+ " this is printing the return value");
        System.out.println("-----");

        //calling third function
        funct3(3,5);
        System.out.println("-----");

        //calling fourth function
        funct4(2,3);


    }

    //DECLATIONS
    //1.	Without Parameters and Without Return Type
    static void funct1() {
        int a,b,sum;
        a=2;b=3;
        System.out.println("sum: "+ (a+b));   //first string -- concat so add brackets
        System.out.println(a+b+" this is sum"); //first int -- maths
    }

    //2.	Without Parameters but With Return Type
    static int funct2(){
        int a=2,b=5;
        return (a+b); //Return will be the last line of the function - anything below that will be non accessible and throw error
    }

    //3.	With Parameters and Without Return Type
    static void funct3(int a, int b){
        System.out.println(a+b);

    }
    //4.	With Parameters and With Return Type
    static int funct4(int a, int b){
        return a+b+100;
    }
}
