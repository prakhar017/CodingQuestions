package mix;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {


        List<Integer> integerList = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5, 5);
        List<Integer> integerList1 = integerList.stream().distinct().toList();
        System.out.println(integerList1);
        HashSet<Integer> set = new HashSet<>();

        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        for( int i =0; i< arr.length;i++){
            set.add(arr[i]);
        }

        System.out.println(set.size());
        System.out.println(set);

    }
}
