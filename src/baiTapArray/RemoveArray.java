package baiTapArray;

import java.util.Arrays;

public class RemoveArray {
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Original array" + Arrays.toString(my_array));
        removeIndexArray(my_array, 1);
        System.out.println("Original array" + Arrays.toString(my_array));

    }
    public static void removeIndexArray(int[] arr, int index){
        for (int i = index; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr = Arrays.copyOfRange(arr,0,arr.length-2);

    }
}
