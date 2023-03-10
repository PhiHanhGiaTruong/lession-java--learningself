package Com.generic;

import java.util.ArrayList;
import java.util.List;

public class Ex06 {
	public static void main(String[] args) {
		List<Integer> intList1 = new ArrayList<>();
		List<Integer> intList2 = new ArrayList<>();

		List<Float> FloatList1 = new ArrayList<>();
		List<Float> FloatList2 = new ArrayList<>();
		copy(intList1, FloatList2);
		
		move(FloatList1, intList2);
	}

	public static  <T extends Number> void copy(List<T> dest, List<T> src) {
		dest.addAll(src);
	}

	public static void move(List<? extends Number> dest, List<? extends Number> src) {
		dest.addAll(src);
	}

}
