package view.stream;

import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;
import bean.Dish.nameCaloriesParameter;
import model.DataModel;

public class Ex09 {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
List<nameCaloriesParameter> result = menu.stream()
	    .map(dish -> new nameCaloriesParameter(dish.getName(), dish.getCalories()))
	    .collect(Collectors.toList());	
	result.forEach(System.out::println);
	}

}
