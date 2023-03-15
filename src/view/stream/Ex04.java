package view.stream;

import java.util.Arrays;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3,1, 4, 6, 7,8);
//        find all even elements
//       Integer[] result =  numbers.stream()
//                .filter(number -> number % 2 ==0)
//                .toArray((int length)->new Integer[length]);

        Integer[] result =  numbers.stream()
                .filter(number -> number % 2 ==0)
                .distinct()
//                length -> new Integer[length] -> constructor reference: Integer[]::new
                .toArray(Integer[]::new);
       Arrays.stream(result) // Stream<Integer>
               .forEach(System.out::println);
    }
}
