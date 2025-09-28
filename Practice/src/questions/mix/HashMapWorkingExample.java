package prac.basics.mix;

import java.util.*;

public class HashMapWorkingExample {

    public static void main(String[] args) {


        Map<String,Integer> map = new HashMap<>();
        map.put("Prakhar",1);
        map.put("Pooja",2);


        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " -->" + m.getValue());

        }


        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);

        Iterator<Integer> itr= set.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

    }
}
