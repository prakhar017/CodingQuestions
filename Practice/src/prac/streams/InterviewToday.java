package prac.basics.streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class InterviewToday {

    public static void main(String[] args) {

        String s = "stress";

        LinkedHashMap<Object, Long> map = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

        for(Map.Entry entry : map.entrySet()){
            if((long)entry.getValue() == 1) {
                System.out.println(entry.getKey() + " -->" + entry.getValue());
                break;
            }
        }



    }

}
