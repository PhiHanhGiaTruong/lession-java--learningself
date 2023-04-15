package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Ex12 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 4, 2, null, null);
        Integer sum = numbers.stream()
                .filter(Objects::nonNull)
                .reduce(0, (a,b)->a+=b);
        System.out.println(sum);
        System.out.println("=========================");
        Optional<Integer> opt = numbers.stream()
                .filter(Objects::nonNull)
//                (a,b) -> a+b
                .reduce(Integer::sum);
        opt.ifPresent(value -> System.out.println(value));
//        find max
        Integer max = numbers.stream()
                .filter(Objects::nonNull)
                .reduce(Integer.MIN_VALUE, (initialMax, element) ->{
                   return element > initialMax ? element:initialMax;
                });
        System.out.println("max: " + max);
    }
}
