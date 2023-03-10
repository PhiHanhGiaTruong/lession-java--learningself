package sort;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex01 {
	public static void main(String[] args) {
		int[] origin = { 1, 8, 10, 5, 9, 7 };
		Invert invert = index -> origin[index] > origin[index + 1];
		bubbleSort(origin, invert);
		System.out.println("Bubble Sort - ASC: " + Arrays.toString(origin));
		Invert invert1 = index -> origin[index] < origin[index + 1];
		bubbleSort(origin, invert1);
		System.out.println("======================");
		System.out.println("Bubble Sort - ASC: " + Arrays.toString(origin));
	}

	private static void bubbleSort(int[] origin, Invert invert) {
		for (int round = 0; round < origin.length; round++) {
			for (int index = 0; index < origin.length - round - 1; index++) {
				if (invert.sort(index)) {
					ArrayUtils.swap(origin, index, index + 1);
				}
			}
		}
	}
}
