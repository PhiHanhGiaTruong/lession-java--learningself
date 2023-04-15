package baiTapArray;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arrays = {
                1, 2, 3, 4, 5, 6, 7, 8, 9
        };
        System.out.println("Original array: " + Arrays.toString(arrays));
        for (int i = 0; i < arrays.length/2; i++){
            int temp = arrays[i];
            arrays[i] = arrays[arrays.length-i-1];
            arrays[arrays.length - i - 1] = temp;
        }
        System.out.println("Reverse array: " + Arrays.toString(arrays));


    }
}
