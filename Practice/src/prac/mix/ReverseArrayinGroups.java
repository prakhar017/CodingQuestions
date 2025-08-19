package prac.basics.mix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayinGroups {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 5;
        List<Integer> list = new ArrayList<>();
        List<Integer> mainList = new ArrayList<>();
        int temp;

        for( int i =0;i <arr.length;i+=k){
            int left= i;
            int right = Math.min(i+k-1, arr.length-1);

            while(left < right){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right]= temp;
                left++;
                right--;
            }
        }

        System.out.println(Arrays.toString(arr));



//        for(int i=0;i<arr.length;i++){
//
//            while (k != 0) {
//
//                if (i == arr.length)
//                    break;
//
//                list.add(arr[i]);
//                k--;
//                i++;
//
//            }
//
//            Collections.reverse(list);
//            mainList.addAll(list);
//            list.clear();
//            k=5;
//            i--;
//        }
//
//        System.out.println(mainList);



/*        List<Integer> mainList = new ArrayList<>();

        for (int i = 0; i < arr.length; i += k) {
            List<Integer> subList = new ArrayList<>();

            for (int j = i; j < i + k && j < arr.length; j++) {
                subList.add(arr[j]);
            }

            Collections.reverse(subList);
            mainList.addAll(subList);
        }

        System.out.println(mainList);

 */






    }
}
