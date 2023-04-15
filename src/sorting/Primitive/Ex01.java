package sorting.Primitive;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        int[] origin = {1, 5, 11, 9, 4, 6};
        BubbleSort(origin, (a,b)-> a > b);
        System.out.println(" sau khi sort: " + Arrays.toString(origin));
        BubbleSort(origin, (a,b)-> a < b);
        System.out.println(" sau khi sort: " + Arrays.toString(origin));


    }
//    Bubble Sort with interger primitive array
    private static void BubbleSort(int[] arr, Condition condition){
        for (int round = 0; round < arr.length; round ++){
            for(int i = 0; i < arr.length -1 -round; i++){
//                arr[i]> arr[i+1]
                if(condition.check(arr[i],arr[i+1])){
                    swap(arr, i, i+1);
                }
            }
        }
    }
    private static void swap(int[] arr, int a, int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;


    }

}
