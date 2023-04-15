package baiTapArray;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        int[] arr = {
                1, 9, 5, 36, 12, 33
        };
        System.out.println("tong cua cac phan tu chan trong mang la: " + sum(arr, element -> element % 2 == 0));
        System.out.println("tong cua cac phan tu chan trong mang la: " + sum(arr, element -> element % 2 != 0));
//        System.out.println("phan tu lon nhat trong mang la: " + find(arr, (a,b) -> a < b));
//        System.out.println("phan tu nho nhat trong mang la: " + find(arr, (a,b) -> a > b));
        System.out.println("phan tu nho nhat va lon nhat trong mang la: " + getMinMax(arr, (a,b) -> a < b,(a,b) -> a > b));
        System.out.println(" chen phan tu gia tri 15 vao vi tri index = 3 cua mang arr: " + Arrays.toString(insertElement(arr,1,15)));
        System.out.println(" xoa phan tu vi tri index = 3 cua mang arr: " + Arrays.toString(removeElement(arr,1)));
//    arr[i] % 2 == 0
    }

    private static int sum(int[] arr, Condition condition) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (condition.check(arr[i])) {
                sum += arr[i];
            }
        }
        return sum;
    }
    private static int[] insertElement(int[] numbers, int k, int newElement){
        int[] result = new int[numbers.length + 1];
        for(int i = 0; i < numbers.length; i++){
            result[i] = numbers[i];
        }
        for(int i = result.length - 1; i > k; i--){
            result[i] = result[i-1];
        }
        result[k] = newElement;
        return result;
    }
    private static int[] removeElement(int[] numbers, int k){
        int[] results = new int[numbers.length -1];
        for(int i = 0; i < k;i++){
            results[i] = numbers[i];
        }
        for(int j = k+1; j < numbers.length;j++){
            results[j-1] = numbers[j];
        }
        return results;
    }

    private static Tuple getMinMax(int[] numbers, Condition2 condition1, Condition2 condition2){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int number : numbers){
//            max < number
            if(condition1.look(max,number)){
                max = number;
            }
//            min > number
            if(condition2.look(min,number)){
                min = number;
            }
        }
        return new Tuple(min,max);

    }
}
