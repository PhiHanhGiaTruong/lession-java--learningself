package view.stream;

import bean.Dish;
import model.DataModel;

import java.util.List;
import java.util.stream.Collectors;

public class Ex09 {
    public static void main(String[] args) {
        List<Dish> menu = DataModel.getDishes();
//       return (Name, Calories)
        List<Dish.NameCaloriesParameter> results = menu
                .stream()
                .filter(dish -> Dish.Kind.MEAT.equals(dish.getKind()))
                .map(dish -> new Dish.NameCaloriesParameter(dish.getName(), dish.getCalories()))
                .collect(Collectors.toList());
        results.forEach(System.out::println);
    }
}
