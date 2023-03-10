package view.dish;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

public class Ex01 {
	/*
	 * Input: List<Dish> menu Requirement: Get dishes which have calories greater
	 * than 400 Output: List<Dish> result
	 */
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		List<Dish> result = filter(menu, dish -> dish.getCalories() > 400);
		result.forEach(System.out::println);
		System.out.println("\n=========================\n");
//		B1: convert Date_Source to Stream
		List<String> streamResult =  menu.stream()
		    .filter(dish -> dish.getCalories()>800)
		    .map(Dish::getName)
		    .collect(Collectors.toList());
		streamResult.forEach(System.out::println);
//		B2: Call methods(API) from stream to handle requirements.
//          methods which are written as Builder Pattern. 
//		
	}

	private static <E> List<E> filter(List<E> elements, Predicate<E> predicate) {
		List<E> result = new ArrayList<>();
		for (E element : elements) {
			if (predicate.test(element)) {
				result.add(element);
			}
		}
		return result;
	}

}
