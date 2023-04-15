package baiTapArray;

public class FindSpecificValue {
    public static void main(String[] args) {
        int[] my_array = {
                1798, 2023, 2022, 1978, 1955, 1998, 1995
        };
        System.out.println(constains(my_array, 1998));
        System.out.println(constains(my_array, 2022));

    }
    public static boolean constains(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== item){
                return true;
            }

        }
        return false;
    }

}
