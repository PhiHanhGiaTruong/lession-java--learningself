package view.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex04 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,3,2,6,2,3,1,4);
//		get unique elements form list of numbers
		
//		Option 1: Manually execute
		Map<Integer, Integer> statNumbers = statistic(numbers);
		System.out.println(statNumbers);
//		Option 2 : Using groupBy method in Stream
		Map<Integer, Long> statDigits = numbers.stream()
		       .collect(Collectors.groupingBy(number-> number, Collectors.counting()));
		
		System.out.println(statDigits);
		List<Integer> uniqueElement =statDigits.entrySet()
		          .stream()
		          .filter(entry -> entry.getValue() == 1)
		          .map(entry -> entry.getKey())
		          .collect(Collectors.toList());
		uniqueElement.forEach(System.out::println);
	}
	private static Map<Integer, Integer> statistic(List<Integer> numbers){
		Map<Integer, Integer> counter = new HashMap<>();
		for(Integer number: numbers) {
			if(!counter.containsKey(number)) {
				counter.put(number, 1);
			} else {
				counter.replace(number, counter.get(number) +1);
			}
		}
		return counter;
	}

}
