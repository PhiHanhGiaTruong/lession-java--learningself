package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex11 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 4, 12, 10);
//        1. is there any  element that is divisible by 10
        Boolean matchDivisible10 = numbers.stream()
                .anyMatch(number -> number % 10 == 0);
        System.out.println("matchDivisible10: " + matchDivisible10);
//        2. find the first element that is divisible by 4
//        Optional<> restrict the cause of exception
        Optional<Integer> opt = numbers.stream()
                .filter(number -> number % 4 == 0)
                .findFirst();
        if (opt.isPresent()) {
            System.out.println(opt.get());
        }
//        opt.isPresent(value -> System.out.println(value));
        System.out.println(opt.orElse(Integer.MAX_VALUE));
//        3. find the element that is divisible by 5 in the list

//        4. does all elements less than 100

//        5. does no elements greater than 0
    }
}
