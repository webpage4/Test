package Oct.ex_29102024;

import java.util.Arrays;
//Minm and Maxm using sorting
public class Lab106 {
    public static void main(String[] args) {
        int[] array = {22,55,66,21,43,85,90,100,54,63};
        Arrays.sort(array);
        int max = array[array.length-1];
        int min = array[0];
        System.out.println("The max no in array is " + max);
        System.out.println("The min no in array is " + min);
    }
}
