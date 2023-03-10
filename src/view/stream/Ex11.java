package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex11 {
	/*
	 * Example: Give a list of numbers: 1, 2, 1, 4, 5, 8, 11, 4, 12 1st: is there
	 * any element that is divisible by 10 2st: find the first element that is
	 * divisible by 4 3nd: find the element that is divisible by 5 in the list 4th:
	 * does all elements less than 100 5th: does no elements greater than 0
	 */
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 1, 4, 5, 8, 11, 4, 12);
		boolean matchdivisibleBy10 = numbers.stream().anyMatch(number -> number % 10 == 0);
		System.out.println("matchdivisibleBy10: " + matchdivisibleBy10);
	Optional<Integer> opt = numbers.stream().filter(number -> number % 7 == 0).findFirst();
	if(opt.isPresent()) {
		System.out.println(opt.get());
	}
	opt.ifPresent(value -> System.out.println(value));
	System.out.println(opt.orElse(Integer.MAX_VALUE));
	}
	

}
