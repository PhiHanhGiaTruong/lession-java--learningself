package utils;

import java.util.List;

public class printf {
	private printf() {

	}
	public static <E> void print(List<E> elements ) {
		for(E element: elements) {
			System.out.println(element + " ");
		}
		System.out.println();
	}

}
