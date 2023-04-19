package genericMethod;

public class Ex01 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        Double[] digits = {6d, 7d, 8d, 9d};
        String[] months = {"JAN", "FEB", "MAR", "APR"};
        printf(numbers);
        printf(digits);
        printf(months);
        System.out.println("==================");
        printg(numbers);
        printg(digits);
        printg(months);
    }
//    Option 1: Idea of OOP >> Pass a sub type for parent
    private static void printf(Object[] integers){
        for (Object object : integers){
            System.out.println(object + " ");
        }
        System.out.println();
    }
//    Option 2: Idea of Generic
//    <E> generic type
private static <E> void printg(E[] integers){
    for (E object : integers){
        System.out.println(object + " ");
    }
    System.out.println();
}

}
