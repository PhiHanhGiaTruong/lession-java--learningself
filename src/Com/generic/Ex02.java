package Com.generic;

import java.util.Arrays;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		List<Double> digits = Arrays.asList(6d,7d, 8d, 9d);
		List<String> months = Arrays.asList("Jan", "FEB", "MAR", "APR");
//		 only worked with option Generic type
//		printf(numbers);
//		printf(digits);
//		printf(months);
		System.out.println("=========================");
		Printg(digits);
		Printg(months);
		Printg(numbers);
	}
//	Option 1: Idea of OOP
//	private static void printf(List<Object> elements) {
//		for(Object element: elements) {
//			System.out.println(element + " ");
//		}
//	}
//	Option 2: Idea of Generic
	private static <E> void Printg(List<E> elements) {
		for(E element: elements) {
			System.out.println(element + " ");
		}
		System.out.println();
		
		
	}
	
	}
	


