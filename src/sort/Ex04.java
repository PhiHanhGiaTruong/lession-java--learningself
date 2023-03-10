package sort;

import common.sortOrder;
import static utils.ArrayUtils.*;

public class Ex04 {
	public static void main(String[] args) {
		int[] origin = { 6, 5, 3, 1, 8, 7, 2, 4 };

		sort(origin, sortOrder.DESC);
		show(origin);
	}

}
