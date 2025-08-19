package prac.basics.mix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MajorityElement {

    public static void main(String[] args) {

        int[] arr = { 7};

        /*Map<Integer, Long> map = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        int maxValue = arr.length/2;

        for ( Map.Entry entry : map.entrySet()){

            if( (long)entry.getValue() > maxValue)
                System.out.println(entry.getKey());

        }*/

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int maxValue = arr.length/2;

        for( int i =0; i< arr.length;i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);

            if(hashMap.get(arr[i]) > maxValue )
                System.out.println(arr[i]);

        }

    }

}
