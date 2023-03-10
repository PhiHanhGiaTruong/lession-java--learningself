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
public class Ex06 {
	public static void main(String[] args) {
		String[] students = { "John Smith", "Shala", "Susan", "Rivarho" };
		//Function<String, String> keyExtractor = (string) -> string;
		//Function<String, String> keyExtractor = Function.identity();
		//Comparator<String> comparator = Comparator.comparing(keyExtractor, Comparator.reverseOrder());
		Comparator<String> comparator = Comparator.comparing(Function.identity(), Comparator.reverseOrder());


		Arrays.sort(students, comparator);
		ArrayUtils.show(students);

		// Required DESC without using reverse method

	}
}
