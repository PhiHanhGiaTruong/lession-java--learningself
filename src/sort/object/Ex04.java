package sort.object;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

/*
 * Sorting with String[] Array 
 *  Using manual insertion  method
 *   Handle null value
 */
public class Ex04 {
	public static void main(String[] args) {
		String[] students = { null, "John Smith", null, "Shala", "Susan", "Rivarho" };
		
		// null last
		// required: NULL FIRST & DESC

		Comparator<String> comparator = new Comparator<String>() {
			@Override
			//null first
			public int compare(String o1, String o2) {
				if(o1 == null) {
					return -1;
				}
				if(o2 == null) {
					return 1;
				}
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		};

		Arrays.sort(students, comparator);
		ArrayUtils.show(students);

		// Required DESC without using reverse method

	}
}
