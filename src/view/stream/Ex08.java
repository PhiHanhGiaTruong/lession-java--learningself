package view.stream;

import java.util.List;

import bean.Dish;
import model.DataModel;

public class Ex08 {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
//		find the first 2 meat dishes
		menu.stream()
		    .filter(dish -> dish.equals(dish.getKind()))
		    .limit(2)
		    .forEach(System.out::println);
	}

}
