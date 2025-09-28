package prac.basics.streams.video;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3);

        // 1. collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        // 2. forEach
        list.stream().forEach(x -> System.out.println(x));

        // 3. reduce : Combines elements to produce a single result
        Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum);
        System.out.println(optionalInteger.get());

        // 4. count

        // 5. anyMatch, allMatch, noneMatch

        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);
        boolean b1 = list.stream().allMatch(x -> x > 0);
        System.out.println(b1);
        boolean b2 = list.stream().noneMatch(x -> x < 0);
        System.out.println(b2);

        // 6. findFirst, findAny
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());

        // 7. toArray()

        Object[] array = Stream.of(1, 2, 3).toArray();

        // 8. min / max
        Comparator<Integer> naturalOrder = Comparator.naturalOrder();
        System.out.println("max: " + Stream.of(2, 44, 69).max((o1, o2) -> o2 - o1));
        System.out.println("max: " + Stream.of(2, 44, 69).max(naturalOrder));
        System.out.println("min: " + Stream.of(2, 44, 69).min(Comparator.naturalOrder()));


        /*
        1. Comparator.naturalOrder()
           Compares using the natural ordering (must implement Comparable).
           For Integer, String, etc.
           Comparator<Integer> cmp = Comparator.naturalOrder();


       2. Comparator.reverseOrder()
          Reverses the natural order.
          Comparator<Integer> cmp = Comparator.reverseOrder();


      3. Comparator.comparing(Function<T, U>)
         Compares objects based on a property.
         Stream.of("apple", "banana", "kiwi").max(Comparator.comparing(String::length));  // longest word


      4. Comparator.comparingInt(ToIntFunction<T>)
         Optimized for int property extraction.
         Stream.of("apple", "banana", "kiwi").min(Comparator.comparingInt(String::length)); // shortest word


      5. Comparator.comparingLong(ToLongFunction<T>)
         For long properties.
         Stream.of(objList).max(Comparator.comparingLong(MyObj::getTimestamp));


      6. Comparator.comparingDouble(ToDoubleFunction<T>)
         For double properties.
         Stream.of(products).min(Comparator.comparingDouble(Product::getPrice));


      7. Chaining Comparators
         Use thenComparing() to break ties.
         Comparator<Person> byAgeThenName = Comparator
                                            .comparingInt(Person::getAge)
                                            .thenComparing(Person::getName);

      8. Custom Lambda
         You can always write your own:
         Comparator<String> cmp = (a, b) -> a.length() - b.length();
        ⚠️ Beware of overflow when subtracting integers — prefer Integer.compare(a, b) for safety.


        */

        // 9. forEachOrdered
        List<Integer> numbers0 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Using forEach with parallel stream:");
        numbers0.parallelStream().forEach(System.out::println);
        System.out.println("Using forEachOrdered with parallel stream:");
        numbers0.parallelStream().forEachOrdered(System.out::println);



        // Example: Filtering and Collecting Names
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        System.out.println(names.stream().filter(x -> x.length() > 3).toList());

        // Example: Squaring and Sorting Numbers
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 6);
        System.out.println(numbers.stream().map(x -> x * x).sorted().toList());

        // Example: Summing Values
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(integers.stream().reduce(Integer::sum).get());

        // Example:  Counting Occurrences of a Character
        String sentence = "Hello world";
        System.out.println(sentence.chars().filter(x -> x == 'l').count());
        Map<Character, Long> map = sentence.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(map);

        // Example
        // Streams cannot be reused after a terminal operation has been called
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
//        List<String> list1 = stream.map(String::toUpperCase).toList(); // exception

        // stateful & stateless



    }
}
