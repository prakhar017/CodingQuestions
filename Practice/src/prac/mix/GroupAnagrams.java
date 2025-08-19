package prac.basics.mix;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] arr = {"eat", "ate", "nat", "tan", "bet"};
        HashMap<String,List<String>> map = new HashMap<>();

        for( int i= 0;i<arr.length;i++){

            String s = arr[i];
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String s1 = String.valueOf(charArray);

            if(map.containsKey(s1)){
                map.get(s1).add(s);
            }

            else{
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(s1, list);
            }
        }

        Collection<List<String>> listCollection = map.values();
        System.out.println(listCollection);
    }
}
