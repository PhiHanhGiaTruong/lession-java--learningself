package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03 {
    public static void main(String[] args) {
        String[] student = {
                "anh vu",
                "the chung",
                "phan quan",
                "bui thuy"
        };
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
//                sắp xếp tăng dần (s1.compareTo(s2)
//                trả về giá trị dương vì s1 > s2 nên sẽ swap)

//                sắp xếp giảm dần s2.compareTo(s1)
//                trả về giá trị âm vì s2 < s1 nên sẽ không swap)
                return s2.compareTo(s1);

            }
        };
       Arrays.sort(student,comparator);
        System.out.println(" mang sau khi sap xep: " + Arrays.toString(student));
    }

}
