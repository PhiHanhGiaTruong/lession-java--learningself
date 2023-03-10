package sort.primiti;
/*
 * Selection Sort.
 */

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex02 {
	public static void main(String[] args) {
		int[] origin = { 1, 8, 10, 5, 9, 7 };
		sort(origin);
		System.out.println("Selection Sort: " + Arrays.toString(origin));

	}

	private static void sort(int[] origin) {
		for (int round = origin.length - 1; round > 0; round--) {
			for (int i = 0; i < round; i++) {
				if (origin[i] > origin[round]) {
					ArrayUtils.swap(origin, i, round);
				}
			}

		}
	}

}
