package baiTapArray;

import java.util.Arrays;

public class MaxMinElementArrays {
    public static void main(String[] args) {
        int[] arrays = {25, 14, 56, 15, 36, 77, 18, 29, 49};
        System.out.println(Arrays.toString(arrays));
        max_min(arrays);
    }
    public static void max_min(int[] array){
        int max = array[0];
        int min = array[0];

        int len = array.length;
        for (int i = 1; i < len - 1; i+= 2){
            if (i + 1 > len){
                if (array[i] > max) max = array[i];
                if (array[i] < min) min = array[i];
            }
            if (array[i] > array[i+1]){
                if (array[i] > max) max = array[i];
                if (array[i+1] < min) min = array[i];
            }else {
                if (array[i] < min) min = array[i];
                if (array[i+1] > max) max = array[i+1];
            }
        }
        System.out.println("Maximum value for the above array = " + max);
        System.out.println("Minimum value for the above array = " + min);

    }

}
