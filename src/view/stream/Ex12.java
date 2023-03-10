package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Ex12 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 5, null, 7, 4);
		Integer sum = numbers.stream().filter(number -> Objects.nonNull(number)).reduce(0, (a, b) -> a + b);
		System.out.println("sum1: " + sum);
		Optional<Integer> opt = numbers.stream().filter(number -> Objects
				                       .nonNull(number)).reduce((a, b) -> a + b);
		opt.ifPresent(value -> System.out.println("sum2: " + value));

		Integer max = numbers.stream()
				             .filter(number -> Objects.nonNull(number))
				             .reduce(Integer.MIN_VALUE, (a, b) -> {return a < b ? b : a;
				             });
		System.out.println("max: " + max);

	}

}
