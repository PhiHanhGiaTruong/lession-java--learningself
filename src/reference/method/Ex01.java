package reference.method;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;

public class Ex01 {
//	get origin country of apple inventory
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getAll();
//		Lambda
//		Set<String> countries = map(inventory, (Apple apple) -> {
//			return apple.getCountry();
//		});
		Set<String> countries = map(inventory,Apple::transfer);
		System.out.println(countries);
	}
	private static <E,R> Set<R> map(List<E> elements, Function<E, R> function) {
		Set<R> result = new HashSet<R>();
		for (E element : elements) {
			result.add(function.apply(element));
		}
		return result;
	}
	

}
