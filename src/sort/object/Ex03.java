package sort.object;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

/*
 * Sorting with String[] Array 
 *  Using manual insertion  method
 */
public class Ex03 {
	public static void main(String[] args) {
		String[] students = { "John Smith", "Shala", "Susan", "Rivarho" };
		Integer[] digits = { 9, 4, 7, 2, 8, 5 };
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		};
		Comparator<Integer> comparator1 = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return (-1) * o1.compareTo(o2);
			}

		};

		Arrays.sort(students, comparator);
		ArrayUtils.show(students);
		Arrays.sort(digits, comparator1);
		ArrayUtils.show(digits);

		// Required DESC without using reverse method

	}
}
