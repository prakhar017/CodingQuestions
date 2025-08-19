package prac.basics.mix;

import java.util.*;
import java.util.stream.Collectors;

public class InterviewSyn {

    public static void main(String[] args) {


        String str = "uyagvasdvsz";
        // uygdz

        LinkedHashMap<Character, Long> map = str.chars()
                                                .mapToObj(c -> (char) c)
                                                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

        for(Map.Entry<Character, Long> entry : map.entrySet()){
            if(entry.getValue() == 1)
                System.out.println(entry.getKey());
        }



        //Q. Find the longest string in a list of strings using Java streams:
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");
        String s = strings.stream().max(Comparator.comparing(String::length)).get();
        System.out.println("///////////////////////////");
        System.out.println(s);


        Integer integer = strings.stream().map(String::length).sorted(Comparator.reverseOrder()).findFirst().get();
        strings.stream().filter(x -> x.length() == integer).forEach(System.out :: println);


        //Q. Check if a list of integers contains a prime number using Java streams:
//        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
//        boolean b = numbers.stream().anyMatch(this::isPrime);



    }

    public static  boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
