package genericMethod;

import java.util.Arrays;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> digits = Arrays.asList(6d, 7d, 8d, 9d);
        List<String> months = Arrays.asList("JAN", "FEB", "MAR", "APR");
//      only worked option 2
//        printf(numbers);
//        printf(digits);
//        printf(months);
        System.out.println("==================");
        printg(numbers);
        printg(digits);
//        printg(months);
        System.out.println("++++++++++++++++");
//        printf(numbers);
//        printf(digits);
        printf(months);
    }

    //    Option 1: Idea of OOP >> Pass a sub type for parent
    private static void printu(List<Object> integers) {
        for (Object object : integers) {
            System.out.println(object + " ");
        }
        System.out.println();
    }

    //    Option 2: Idea of Generic
//    <E> generic type
    private static <E extends Number> void printg(List<E> integers) {
        for (E object : integers) {
            System.out.println(object + " ");
        }
        System.out.println();
    }
    private static <E extends CharSequence> void printf(List<E> integers) {
        for (E object : integers) {
            System.out.println(object + " ");
        }
        System.out.println();
    }
}
