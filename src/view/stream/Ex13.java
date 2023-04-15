package view.stream;

import bean.Dish;
import model.DataModel;

import java.util.List;

public class Ex13 {
    public static void main(String[] args) {
        List<Dish> menu = DataModel.getDishes();
//        find dish with maximum calories
        if (menu.isEmpty()){
            System.out.println("Menu length should be greater than 0");
        }
       Dish dish =  menu.stream()
//                reduce(initial value, lambda)
                .reduce(menu.get(0),(initialDish, element) -> {
                    if (initialDish.getCalories() < element.getCalories()){
                        return element;
                    }
                    return initialDish;
                });
        System.out.println(dish);
    }
}
