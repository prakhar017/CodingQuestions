package prac.basics.streams;

import java.util.Arrays;
import java.util.List;

public class PeekExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        names.stream()
                .filter(name -> name.length() > 3)
                .peek(name -> System.out.println("Filtered name: " + name))
                .map(String::toUpperCase)
                .forEach(name -> System.out.println("Final name: " + name));
    }
}