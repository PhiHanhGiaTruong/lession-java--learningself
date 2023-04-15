package sorting.Primitive;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        int[] origin = {1, 5, 11, 9, 4, 6};
//        selectionSort(origin, (a,b) -> a > b);
//        System.out.println("mang sau khi sort: " + Arrays.toString(origin));
//        selectionSort(origin, (a,b) -> a < b);
//        System.out.println("mang sau khi sort: " + Arrays.toString(origin));
        insertionSort(origin, (a,b) -> a < b);
        System.out.println("mang sau khi sort: " + Arrays.toString(origin));
    }
    private static void selectionSort(int[] arr, Condition condition){
        for (int round = 0; round < arr.length; round++){

            for(int i = round + 1; i < arr.length ; i++){
//                arr[round] > arr[i]
                if(condition.check(arr[round],arr[i])){
                    swap(arr, round, i);
                }
            }
        }
    }
    private static void insertionSort(int[] arr, Condition condition){
        for (int round = 1; round < arr.length; round++){

            for(int i = 0; i < round ; i++){
//                arr[round] < arr[i]
                if(condition.check(arr[round],arr[i])){
                    swap(arr, round, i);
                }
            }
        }
    }
    private static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
