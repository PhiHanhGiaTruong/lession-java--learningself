package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class JavaFunctionDemo {
	public static void main(String[] args) {
		List<String> elements = Arrays.asList("aaa", "bb", "cccc", "ddd");
//		List<Integer> elements1 = convert(elements,t->t.length());
		List<Integer> elements1 = convert(elements, new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		});
		System.out.println(elements1);
//		List<Character> firstLetter = convert(elements,t->t.charAt(0));
	List<Character> firstLetter = convert(elements, new Function<String, Character>() {
	@Override
	public Character apply(String t) {
		return t.charAt(0);
	}
	});
		System.out.println(firstLetter);
	}

	private static <E,R> List<R> convert(List<E> elements, Function<E, R> function) {
		List<R> result = new ArrayList<>();
		for (E element : elements) {
			result.add(function.apply(element));
		}
		return result;
	}
}
