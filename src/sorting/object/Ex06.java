package sorting.object;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import static java.util.function.Function.*;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

public class Ex06 {
    public static void main(String[] args) {
        String[] student = {
                "anh vu",
                "the chung",
                "phan quan",
                "bui thuy"
        };

        Function<String,String> KeyExtractor = identity();

        Comparator<String> comparator = comparing(KeyExtractor, reverseOrder());
       Arrays.sort(student,comparator);
        System.out.println(" mang sau khi sap xep: " + Arrays.toString(student));
    }

}
