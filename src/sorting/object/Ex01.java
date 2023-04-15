package sorting.object;

import sorting.Primitive.Condition;

import java.util.Arrays;
import java.util.Comparator;

public class Ex01 {
    public static void main(String[] args) {
        String[] students = {
                "anh vu",
                "the chung",
                "phan quan",
                "bui thuy"
        };
        Comparator<String> compator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };
        Arrays.sort(students,compator);
        System.out.println("mang sau khi sap sep" + Arrays.toString(students));


    }


}

