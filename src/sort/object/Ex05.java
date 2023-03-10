package sort.object;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import utils.ArrayUtils;

/*
 * Sorting with String[] Array 
 *  Using manual insertion  method
 *   Handle null value
 */
public class Ex05 {
	public static void main(String[] args) {
		String[] students = { "John Smith", "Shala", "Susan", "Rivarho" };

		// null last
		// required: NULL FIRST & DESC

		/*
		 * Comparator<String> comparator = (o1, o2) -> { if (o1 == null) { return -1; }
		 * if (o2 == null) { return 1; } return o2.compareTo(o1);
		 * 
		 * };
		 * 
		 */
		Function<String, String> keyExtractor = new Function<String, String>() {
			@Override
			public String apply(String string) {
				// TODO Auto-generated method stub
				return string;
			}
		};
		Comparator<String> comparator = Comparator.comparing(keyExtractor, Comparator.reverseOrder());

		Arrays.sort(students, comparator);
		ArrayUtils.show(students);

		// Required DESC without using reverse method

	}
}
