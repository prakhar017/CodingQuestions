package prac.basics.mix;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class InterviewTest {

    public static void main(String[] args) {

        String input = "javaprogramming";

        LinkedHashMap<Character, Long> map = input.chars()
                                                  .mapToObj(c -> (char) c)
                                                  .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

        map.forEach((x, y) -> {
            System.out.println(x + "-->" + y);
        });




    }
}
