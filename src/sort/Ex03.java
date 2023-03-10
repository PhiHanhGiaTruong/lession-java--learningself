package sort;

import java.util.Arrays;

public class Ex03 {
	/*
	 * Insertion sort
	 */
	public static void main(String[] args) {
		int[] digits = { 4, 3, 2, 10, 12, 1, 5, 6 };
		InsertSort(digits);
		System.out.println(Arrays.toString(digits));
	}
 private static void InsertSort(int[] elements) {
	 for(int i = 1; i < elements.length; i++) {
		 for(int j = 0; j<i; j++) {
			 if(elements[i]<elements[j]) {
				 swap(elements, i, j);
			 }
		 }
	 }
 }
 private static void swap(int[] arr, int a, int b) {
	 int result = arr[a];
	 arr[a] = arr[b];
	 arr[b] = result;
 }

}
