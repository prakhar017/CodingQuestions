package prac.basics.mix;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();



        HashMap<Character, Integer> map = new HashMap<>();

        input = input.toLowerCase();

        for (Character ch : input.toCharArray()) {
            if (Character.isLetter(ch)) map.put(ch, map.getOrDefault(ch, 0) + 1);

        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());

        }

    }
}
