package prac.basics.mix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementPartII {

    public static void main(String[] args) {


        int[] arr = {-5,3,-5};

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for( int num : arr) {
            hashMap.put(num, hashMap.getOrDefault(num,0) + 1);

            if(hashMap.get(num) > Math.floor(arr.length/3))
                list.add(num);

        }

        System.out.println(list);
    }
}
