package prac.basics.mix;

import java.util.Arrays;

public class RotateArrayByLeft {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6};
        int d = 2;
        int n = a.length;


        reverse(a, 0, d - 1);
        reverse(a, d, n - 1);
        reverse(a, 0, n - 1);

        System.out.println(Arrays.toString(a));

    }
        public static void reverse( int[] arr, int start, int end){

            int temp;

            while(start < end){
                temp = arr[start];
                arr[start] = arr[end];
                arr[end]= temp;
                start++;
                end--;




        }
    }


}
