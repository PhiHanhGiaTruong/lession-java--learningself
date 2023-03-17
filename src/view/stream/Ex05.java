package view.stream;

import bean.Dish;
import model.DataModel;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex05 {
    public static void main(String[] args) {
        List<Dish> menu =  DataModel.getDishes();
//        1 2 3 2 5 3 6 7
//        List<Dish> result = menu.stream()
//                .distinct()
//                .collect(Collectors.toList());
//        result.forEach(System.out::println);
        Set<Dish> result = menu.stream()
                .collect(Collectors.toSet());
        result.forEach(System.out::println);
    }
}
