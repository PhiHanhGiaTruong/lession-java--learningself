package view.stream;

import bean.Dish;
import model.DataModel;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex06 {
    public static void main(String[] args) {
        List<Dish> menu =  DataModel.getDishes();
//        1 2 3 2 5 3 6 7
//        chúng ta sẽ duyệt từng phần tử trong menu
//        ,nếu nó chưa tồn tại trong set này thì chúng ta
//        sẽ add vào set, theo một điều kiện id
        Function<Dish, Boolean> function =  dish-> dish.isVegetarian();

        Predicate<Dish> predicate = distinctByKey(dish -> dish.getId());
//dish -> dish.getKind() : Dish::getKind
        List<Dish> results =  menu.stream()
//                ta cần truyền một predicate vào filter
                .filter(distinctByKey(Dish::getKind))
                .collect(Collectors.toList());
        results.forEach(System.out::println);
    }
//    viết một function có thể dùng cho tất cả các điều kiện, dữ liệu truyền vào
//    ta sử dung generics
//    C: khai báo kiểu đối tượng truyền vào
//    P: khai báo thuộc tính trả về
    private static <C, P> Predicate<C> distinctByKey(Function<C,P> function){
        Set<P> set = new HashSet<>();
        return dish -> set.add(function.apply(dish));
    }
}
