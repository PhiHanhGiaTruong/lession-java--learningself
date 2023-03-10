package operation;

import java.util.Arrays;

public class Ex01 {
	/*
	 * - Tính tổng của các số lẻ trong chuỗi. - Tìm giá trị lớn nhất, giá trị nhỏ
	 * nhất trong một vòng lặp. - Thêm phần tử vào vị trị index thứ k. - Di chuyển
	 * một phần tử tại vị trí index thứ k. - Lấy phần tử tại vị trí index k.
	 * Reverse an array
	 */
	public static void main(String[] args) {
		int[] numbers = { 1, 9, 5, 12, 36, 33 };
		System.out.println(Arrays.toString(numbers));
		Strategy oddStrategy = number -> number % 2 != 0;
		int sumOfOddElms = sum(numbers, oddStrategy);
		System.out.println("sumOfOddElms: " + sumOfOddElms);
		Tuple minMaxTuple = getMaxMin(numbers);
		System.out.println("minMaxTuple: " + minMaxTuple);
	//	int[] insert = add(numbers, 5, 3);
		System.out.println("===================");
		System.out.println(Arrays.toString(numbers));
		System.out.println("===");
		//System.out.println(Arrays.toString(insert));
		System.out.println(" mang sau khi da remote phan tu index = 3");
		int[] removeArrays = remote(numbers, 3);
		System.out.println(Arrays.toString(removeArrays));
		System.out.println("==================");
		System.out.println(" mang sa khi da delete phan tu index = 3");
		int[] deleteArrays =delete(numbers, 3);
		System.out.println(Arrays.toString(deleteArrays));

	}

	// - Di chuyển một phần tử tại vị trí index thứ k.
	private static int[] remote(int[] numbers, int index) {
		if (index < 0 || index > numbers.length - 1) {
			throw new IllegalArgumentException(index + "Cannot out of range(0," + (numbers.length - 1) + ")");
		}
		int[] reset = new int[numbers.length - 1];
		for (int i = 0; i < index; i++) {
			reset[i] = numbers[i];
		}
		for (int i = index; i < reset.length; i++) {
			reset[i] = numbers[i];
		}
		return reset;
	}

	// - Thêm phần tử vào vị trị index thứ k.
	@SuppressWarnings("unused")
	private static int[] add(int[] numbers, int index, int newElement) {
		if (index < 0 || index > numbers.length - 1) {
			throw new IllegalArgumentException(index + "Cannot out of range(0," + (numbers.length - 1) + ")");
		}
		int[] result = new int[numbers.length + 1];
		for (int i = 0; i < numbers.length; i++) {
			result[i] = numbers[i];
		}
		// dịch phải: duyệt từ phải sang trái.
		// a[i] = a[i+1]
		for (int i = result.length - 1; i > index; i++) {
			result[i] = numbers[i - 1];

		}
		result[index] = newElement;
		return result;
	}

	// một phần tử tại vị trí index thứ k. - Lấy phần tử tại vị trí index k.
	private static int[] delete(int[] origin, int k) {
		int[] result = Arrays.copyOfRange(origin, 0, origin.length);
		for(int i = k ; i < result.length-1; i++) {
			result[i] = result[i +1];
			
		}		
		return Arrays.copyOfRange(result, 0, result.length-1);
	}

	// - Tính tổng của các số lẻ trong chuỗi.
	private static int sum(int[] numbers, Strategy strategy) {
		int sum = 0;
		for (int number : numbers) {
			if (strategy.execute(number)) {
				sum += number;
			}
		}
		return sum;
	}

	// - Tìm giá trị lớn nhất, giá trị nhỏ nhất trong một vòng lặp.
	private static Tuple getMaxMin(int[] numbers) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int number : numbers) {
			if (max < number) {
				max = number;
			}
			if (min > number) {
				min = number;
			}
		}
		return new Tuple(max, min);
	}

	

}
