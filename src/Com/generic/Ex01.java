package Com.generic;

public class Ex01 {
	public static void main(String[] args) {
		Integer[] numbers = {1,2,3,4,5};
		Double[] digits = {6d,7d, 8d, 9d};
		String[] months = {"Jan", "FEB", "MAR", "APR"};
		printf(numbers);
		printf(digits);
		printf(months);
		System.out.println("=========================");
		Printg(digits);
		Printg(months);
		Printg(numbers);
	}
//	Option 1: Idea of OOP
	private static void printf(Object[] elements) {
		for(Object element: elements) {
			System.out.println(element + " ");
		}
	}
//	Option 2: Idea of Generic
	private static <E> void Printg(E[] elements) {
		for(E element: elements) {
			System.out.println(element + " ");
		}
		System.out.println();
		
		
	}
	

}
