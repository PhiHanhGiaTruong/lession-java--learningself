package sort.object;

import utils.ArrayUtils;

/*
 * Sorting with String[] Array 
 *  
 */
public class Ex01 {
	public static void main(String[] args) {
		String[] students = { "John Smith", "Shala", "Susan", "Rivarho" };
		insertionSort(students);
		ArrayUtils.show(students);
		// Required ASC

	}

	private static void insertionSort(String[] sequences) {
		for (int i = 1; i < sequences.length; i++) {
			String key = sequences[i];
			for (int j = 0; j < i; j++) {
				if (key.compareTo(sequences[j]) < 0) {
					ArrayUtils.swap(sequences, i, j);

				}
			}

		}
	}

}
