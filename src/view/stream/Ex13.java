package view.stream;

import java.util.List;

import bean.Dish;
import model.DataModel;

public class Ex13 {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
//		Find dish with maximum calories
		if(menu.isEmpty()) {
			System.out.println("Menu length should be greater than 0");
			return;
		}
		Dish dish = menu.stream()
				        .reduce(menu.get(0),(d1,d2)->{
			if(d1.getCalories()< d2.getCalories()) {
				return d2;
			}
			return d1;
		});
		System.out.println(dish);
	}

}
