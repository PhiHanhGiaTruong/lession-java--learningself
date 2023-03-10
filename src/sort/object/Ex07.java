package sort.object;

import java.util.Arrays;
import static java.util.Comparator.*;
import static java.util.function.Function.*;

import utils.ArrayUtils;

/*
 * Sorting with String[] Array 
 *  Using manual insertion  method
 *   Handle null value
 */
public class Ex07 {
	public static void main(String[] args) {
		String[] students = { null, "John Smith", null, "Shala", "Susan", "Rivarho" };
//		null First
		//Arrays.sort(students, nullsFirst(comparing(identity(), reverseOrder())));
//		null Last
		Arrays.sort(students, nullsLast(comparing(identity(), reverseOrder())));
		ArrayUtils.show(students);
	}

}
