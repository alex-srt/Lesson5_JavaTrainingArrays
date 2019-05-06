/*Increase by 2*/

import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        int[] arr = {2, 5, -5, 0, -4444, 555, 7};
/*        for (int i : arr) {
            if ( i>=0) {
                arr[i]=i+2;
            }
        }*/
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arr[i] = arr[i] + 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
