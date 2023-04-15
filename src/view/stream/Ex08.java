package view.stream;

import bean.Dish;
import model.DataModel;

import java.util.List;
import java.util.stream.Collectors;

public class Ex08 {
    public static void main(String[] args) {
        List<Dish> menu = DataModel.getDishes();

//        Find the first 2 meat dishes
        List<Dish> dishList = menu.stream()
                .filter(dish -> Dish.Kind.MEAT.equals(dish.getKind()))
                .limit(2)
                .collect(Collectors.toList());
        dishList.forEach(System.out::println);
    }
}
