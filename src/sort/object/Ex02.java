package sort.object;

import java.util.Arrays;

import utils.ArrayUtils;
/*
 * Sorting with String[] Array 
 *  Using manual insertion  method
 */
public class Ex02 {
	public static void main(String[] args) {
		String[] students = { "John Smith", "Shala", "Susan", "Rivarho" };
		// required: Each element implements Comparable Interface
		// Override method "compareTo" to define ASC || DESC
		// String implement CompareTo
		// Default: ASC
		Arrays.sort(students);
		ArrayUtils.show(students);
		// Required DESC without using reverse method

	}

	

}
