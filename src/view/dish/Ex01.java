package view.dish;

import bean.Dish;
import model.DataModel;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
Input: List<Dish> menu
Requirement: Get dishes which have calories greater then 400
             Generate for any condition, any class
Output: List<Dish> result
 */
public class Ex01 {
    public static void main(String[] args) {
        List<Dish> menu = DataModel.getDishes();
//        List<Dish> result = filter(menu);
        List<Dish> result = filter(menu, dish -> dish.getCalories()>400);
        result.forEach(System.out::println);
    }
//    private static List<Dish> filter(List<Dish> menu){
//        List<Dish> result = new ArrayList<>();
//        for (Dish dish : menu){
//            if (dish.getCalories() > 400){
//                result.add(dish);
//
//            }
//        }
//        return result;
//
//    }
private static List<Dish> filter(List<Dish> menu, Predicate<Dish> predicate){
    List<Dish> result = new ArrayList<>();
    for (Dish dish : menu){
        if (predicate.test(dish)){
            result.add(dish);

        }
    }
    return result;

}
}
