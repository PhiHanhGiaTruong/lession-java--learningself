package sorting.object;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

public class Ex05 {
    public static void main(String[] args) {
        String[] student = {
                "anh vu",
                "the chung",
                "phan quan",
                "bui thuy"
        };
//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
////             trả về giá trị âm vì s2 < s1 nên sẽ không swap)
//                return s2.compareTo(s1);
//
//            }
//        };
        Function<String,String> KeyExtractor = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s;
            }
        };
        Comparator<String> comparator = comparing(KeyExtractor, reverseOrder());
       Arrays.sort(student,comparator);
        System.out.println(" mang sau khi sap xep: " + Arrays.toString(student));
    }

}
