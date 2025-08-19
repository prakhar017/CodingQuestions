package prac.basics.mix;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Interview {

    public static void main(String[] args) {


        String input = "prakhar mishra";
        // Output  - p

        char[] chars = input.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);

        }







    }
}
