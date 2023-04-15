package view.primitive.stream;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
//        List<Integer>#stream ==> Stream<Integer>
        int[] digits = {1, 4, 6,7};
        int sum = Arrays.stream(digits)
                .filter(digit -> digit%2 ==0)
                .sum();
        System.out.println("sum: " + sum);
    }
}
