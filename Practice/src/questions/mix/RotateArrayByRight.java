package prac.basics.mix;

import java.util.Arrays;

public class RotateArrayByRight {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};
        int k = 5;
        int rk = arr.length - k;
        rotateArrayByRight(arr, rk);
        System.out.println(Arrays.toString(arr));


    }

    private static void rotateArrayByRight(int[] arr, int rk) {

        rk = rk % arr.length;

        reverse(arr, 0, rk - 1);
        reverse(arr, rk, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

    }


    private static void reverse(int[] arr, int left, int right) {
        int temp = 0;

        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
    }
}
