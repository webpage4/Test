package Oct.ex_29102024;

import java.util.Arrays;

public class Lab104 {
    public static void main(String[] args) {
        int[] marks = {11,35,65,92,3,67};
        System.out.println("Array:");
        for (int i=0; i < marks.length; i++ ){
            System.out.println(marks[i]);
        }
        System.out.println(marks[4]);

        Arrays.sort(marks);
        System.out.println("Sorted Array");
        for (int i=0; i < marks.length; i++ ){
            System.out.println(marks[i]);
        }
        Arrays.sort(marks);
        int item_index = Arrays.binarySearch(marks,65);
        System.out.println("Item index : " + item_index);

    }
}
