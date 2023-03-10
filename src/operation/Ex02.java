package operation;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		int[] numbers = { 2, 4, 3, 6, 4, 8, 7 };
		reverse(numbers);
		System.out.println("Reverse: " + Arrays.toString(numbers));
	}

	private static void reverse(int[] origin) {

		for (int i = 0; i < origin.length / 2; i++) {
			int tmp = origin[i];
			origin[i] = origin[origin.length - i - 1];
			origin[origin.length - i - 1] = tmp;
		}
	}

}
