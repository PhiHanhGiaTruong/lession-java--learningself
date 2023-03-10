package Com.generic;

public class Ex05 {
	public static void main(String[] args) {
		IList<Integer> numbers = new CustomeList<>();
		numbers.add(5);
		numbers.add(7);
		numbers.add(12);
		numbers.add(20);
		int count = numbers.count( number ->number % 7 == 0);
	System.out.println("number of power of 5: " + count);

	}

}
