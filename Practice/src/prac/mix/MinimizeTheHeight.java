package prac.basics.mix;

import java.util.Arrays;

public class MinimizeTheHeight {

    public static void main(String[] args) {

       int arr[] = {1, 5, 8, 10};
       int k =2;

        Arrays.sort(arr);

        int n = arr.length;
        int first = arr[0];
        int last =   arr[n-1];
        int ans = last - first;

        int small = first + k;
        int big = last - k;


        if (small > big) {
            int temp = small;
            small = big;
            big = temp;
        }



        for( int i =1; i< n-1;i++){


            int min = arr[i] - k;
            int max = arr[i] + k;


            if (min < 0) {
                continue;
            }

           min =  Math.min(small, min);
           max =  Math.max(big, max);


        ans  =  Math.min(ans, max-min);
         }

        System.out.println(ans);


    }
}
