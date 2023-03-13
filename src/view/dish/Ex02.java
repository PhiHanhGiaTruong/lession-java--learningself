package view.dish;

import bean.Dish;
import model.DataModel;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
Input: List<Dish> menu
Requirement: Get dishes which have calories greater then 400
             Generate for any condition, any class
Output: List<Dish> result
 */
public class Ex02 {
    public static void main(String[] args) {
        List<Dish> menu = DataModel.getDishes();
//        List<Dish> result = filter(menu);
        List<Dish> result = filter(menu, dish -> dish.getCalories()>400);
        result.forEach(System.out::println);
        System.out.println("=============================");
//
//        B1: Convert Data_Source to Stream
//            List<Dish> --> Stream<Dish>
//        B2: Call method(API) from stream to handle requirements
//            method which is written as Builder Pattern
//        B3: Return List<Dish>
        List<String> streamResults =  menu.stream()
                .filter(dish -> dish.getCalories()>800)
                .map(Dish::getId)
                .collect(Collectors.toList());
        streamResults.forEach(System.out::println);
    }

private static <E> List<E> filter(List<E> elements, Predicate<E> predicate){
    List<E> result = new ArrayList<>();
    for (E element : elements){
        if (predicate.test(element)){
            result.add(element);

        }
    }
    return result;

}
}
