package prac.basics.mix;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class MoveZeroesToEnd {

    public static void main(String[] args) {


        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

        int i, j = 0, count = 0;

        for (i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            } else {
                count++;
            }
        }

        for(i=0;i<count;i++){
            arr[j]=0;
            j++;
        }

        System.out.println(Arrays.toString(arr));
        //Arrays.stream(arr).forEach(x-> System.out.print(x));
    }
}
