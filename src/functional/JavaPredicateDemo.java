package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class JavaPredicateDemo {
	public static void main(String[] args) {
//		predicate to check String length is greater than 8 or not
//Predicate<String> predicate = new Predicate<String>() {
//	
//	@Override
//	public boolean test(String t) {
//		return t.length() >2;
//	}
//};
List<String> result = filter(Arrays.asList("aa", "bbb", "ccc", "d"),t-> t.length() >2);
		for(String element:result) {
			System.out.println(element);
		}
	}
	private static List<String> filter(List<String> elements, Predicate<String> predicate){
		List<String> result = new ArrayList<String>();
		for(String element: elements) {
			if(predicate.test(element)) {
				result.add(element);
				
			}
		}
		return result;
	}

}
