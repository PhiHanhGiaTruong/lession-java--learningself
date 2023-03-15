package view.stream;

import bean.Apple;
import model.DataModel;

import java.util.List;
import java.util.stream.Stream;
// chứng minh rằng những thao tác trong stream chỉ thực hiện một lần duy nhất.

public class Ex01 {
    public static void main(String[] args) {
        List<Apple> inventoryApple =  DataModel.getApples();
//        convert List to stream we are use method stream()
        Stream<Apple> streamApple = inventoryApple.stream();
        streamApple.forEach(System.out::println);
        System.out.println("================");
        streamApple.forEach(System.out::println);

    }
}
