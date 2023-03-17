package view.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex04 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3,1, 4, 6, 7,8);

        Map<Integer,Long> statDigits = numbers.stream()
                .collect(Collectors.groupingBy(number-> number,Collectors.counting()));
        System.out.println(statDigits);
       List<Integer> uniquElement= statDigits.entrySet()
                .stream()
                .filter(entry -> entry.getValue()==1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
        System.out.println(statDigits);
    }
}
