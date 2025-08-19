package prac.basics.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@FunctionalInterface
public interface Functionalnterface {
    void show(int a, int b);
}


class A {
    public static void main(String[] args) {

        // 5 2 3 + * 4 *


        String input = "5 2 3 + * 4 *";
        String[] split = input.split(" ");


        //Stack


        Functionalnterface fc = (a, b) -> System.out.println(a + b);
        System.out.println(fc.getClass());
        fc.show(3, 4);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream().map(l -> l * 2);


    }
}


