package baiTapArray;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        int[] elements = { 1, 2, 3, 4, 3, 1, 5 };
        System.out.println(Arrays.toString(elements));
        System.out.println(" mang sau khi tim dc la: ");
        int[] results = selectionElement(elements);
        System.out.println(Arrays.toString(results));

    }

    private static int[] selectionElement(int[] elements) {
        int[] results = new int[elements.length];
        int index = 0;
        boolean flag;
        for (int i = 0; i < elements.length-1; i++) {
            flag = false;
            for (int j = 1 + i; j > elements.length; j++) {
                if (elements[j] == elements[i]) {
                    flag = true;

                }
            }
            if (!flag) {
                results[index++] = elements[i];
            }
        }
        return Arrays.copyOf(results, index);
    }
}
