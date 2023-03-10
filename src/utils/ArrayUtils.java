package utils;

import java.util.Arrays;

import bean.Item;

// Hàm ở trong Utils luôn để ở public public.

public class ArrayUtils {
	public static void swap(int[] origin, int before, int after) {
		int tmp = origin[before];
		origin[before] = origin[after];
		origin[after] = tmp;
	}

	public static void swap(String[] origin, int before, int after) {
		String tmp = origin[before];
		origin[before] = origin[after];
		origin[after] = tmp;
	}

	public static void sort(int[] origin, sortOrder order) {
		Arrays.sort(origin);
		if (order == sortOrder.DESC) {
			reverse(origin);
		}
	}

	public static void reverse(int[] origin) {
		for (int i = 0; i < origin.length / 2; i++) {
			int tmp = origin[i];
			origin[i] = origin[origin.length - 1 - i];
			origin[origin.length - 1 - i] = tmp;
		}
	}
	public static void reverse(String[] origin) {
		for (int i = 0; i < origin.length / 2; i++) {
			String tmp = origin[i];
			origin[i] = origin[origin.length - 1 - i];
			origin[origin.length - 1 - i] = tmp;
		}
	}

	public static void show(int[] a) {
		System.out.println(Arrays.toString(a));
	}
	public static void show(Item[] a) {
		System.out.println(Arrays.toString(a));
	}
	public static void show(String[] a) {
		System.out.println(Arrays.toString(a));
	}
	public static void show(Integer[] a) {
		System.out.println(Arrays.toString(a));
	}



}
