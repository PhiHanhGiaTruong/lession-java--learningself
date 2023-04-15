package sorting.object;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import static java.util.Comparator.*;
import static java.util.function.Function.identity;

public class Ex07 {
    public static void main(String[] args) {
        String[] student = {
                "anh vu",null,
                "the chung",
                "phan quan", null,
                "bui thuy"
        };

        Function<String,String> KeyExtractor = identity();

//        Comparator<String> comparator = nullsFirst(comparing(KeyExtractor, reverseOrder()));
        Comparator<String> comparator = nullsLast(comparing(KeyExtractor, reverseOrder()));
       Arrays.sort(student,comparator);
        System.out.println(" mang sau khi sap xep: " + Arrays.toString(student));
    }

}
