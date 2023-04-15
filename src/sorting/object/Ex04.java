package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

public class Ex04 {
//    xử lý trường hợp null values.
//    null first.
//    null last.
//    yêu cầu null, DESC
    public static void main(String[] args) {
        String[] student = {
                "anh vu",null,
                "the chung",
                "phan quan",null,
                "bui thuy"
        };
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1 == null){
                    return  1;
                }
                if(s2 == null){
                    return -1;
                }
                return s2.compareTo(s1);
            }

        };
       Arrays.sort(student,comparator);
        System.out.println(" mang sau khi sap xep: " + Arrays.toString(student));
    }

}
