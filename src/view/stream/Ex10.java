package view.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Ex10 {
    //     FlatMap --> Array, List
    public static void main(String[] args) {
//        Integer[][] numbers = {{1, 4, 7},
//                {2, 5, 8},
//                {3, 6, 9}
//        };
//        Integer[] results = Arrays.stream(numbers)
//                .flatMap(Arrays::stream)
//                .toArray(Integer[]::new);
//        Arrays.stream(results).forEach(System.out::println);
        List<List<String>> cards = Arrays.asList(
                Arrays.asList("2 co", "3 ro", "4 bich"),
                Arrays.asList("2 co", "3 ro", "4 bich"),
                Arrays.asList("2 co", "3 ro", "4 bich")
        ) ;
        String remainingCards = cards.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.joining(", "));
        System.out.println(remainingCards);
    }

}
