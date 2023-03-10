package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaConvertDemo {
	public static void main(String[] args) {
		List<String> elements = Arrays.asList("aaa", "bb", "cccc", "ddd");
//		List<Integer> lengths =	convert(elements, string -> string.length());
	List<Integer> lengths =	convert(elements, new Convertor<Integer>() {
			@Override
			public Integer execute(String string) {
				return string.length();
			}
		});
	System.out.println(lengths);
	
//	List<Character> firstLetter = convert(elements, string -> string.charAt(0));
	List<Character> firstLetter = convert(elements, new Convertor<Character>() {
		@Override
		public Character execute(String string) {
			return string.charAt(0);
		}
	});
System.out.println(firstLetter);
}
// Using strategy pattern - Functional Interface
// input: element(String)
// output: length, char >> Generic Type.

//private List<Integer> toLength(List<String> elements){
//	List<Integer> result = new ArrayList<Integer>();
//	for(String element: elements) {
//		result.add(element.length());
//	}
//	return result;
//}
	private static <R> List<R> convert(List<String> elements, Convertor<R> convertor) {
		List<R> result = new ArrayList<>();
		for (String element : elements) {
			result.add(convertor.execute(element));
		}
		return result;
	}
}
