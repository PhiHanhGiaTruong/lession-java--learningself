package view.stream;

import bean.Apple;
import model.DataModel;

import java.util.List;
import java.util.stream.Collectors;

public class Ex02 {
    public static void main(String[] args) {
        List<Apple> inventoryApple = DataModel.getApples();
       List<Integer> result = inventoryApple.stream()
                .filter(apple -> apple.getWeight()>100) // Stream<Apple>
                .map(Apple::getId) //Stream<String>
                .collect(Collectors.toList());// List<String>
        result.forEach(System.out::println);

    }
}
