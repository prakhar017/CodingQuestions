package prac.basics.mix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recursion_Subsets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        List<String> result = new ArrayList<>();


        findSubets(input, "", 0, result);
        result.stream().sorted().forEach( System.out::println);
    }

    private static void findSubets(String input, String s, int i, List<String> result) {

        if( i == input.length()){
            result.add(s);
            return;
        }


        findSubets(input,s, i+1, result);
        findSubets(input, s + input.charAt(i), i+1, result);



    }
}
