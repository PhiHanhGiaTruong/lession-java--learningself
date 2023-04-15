package baiTapArray;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        int[] origin = {1, 2, 3, 4, 3, 1};
        int[] temp = new int[origin.length];
        int index = 0;
        for (int i = 0; i < origin.length - 1; i++) {
            int element = origin[i];
            for (int j = 1 + i; j < origin.length; j++) {
                if (check(element, origin[j])) {
                    temp[index] = element;

                }
            }
        }

        System.out.println(Arrays.toString(Arrays.copyOfRange(temp, 0, index)));
    }
    private static boolean check(int a, int b) {
        if (a == b) {
            return false;
        }
        return true;
    }
}
