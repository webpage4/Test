package Oct.ex_29102024;
//IMP : Minm/Maxm of array
public class Lab105 {
    public static void main(String[] args) {
        int [] array = {22,55,66,21,43,85,90,100,54,63};
        int max_value = give_max(array);
        int min_value = give_min(array);
        System.out.printf("Maximum value in array is %d\n" , max_value);
        System.out.printf("Minimum value in array is %d", min_value);

    }

    static int give_max(int array[]){
        int max  = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i]> max) {
                max = array[i];
            }
        }
        return max;
    }

    static int give_min(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]< min){
                min = array[i];
            }
        }
        return min;
    }

}
