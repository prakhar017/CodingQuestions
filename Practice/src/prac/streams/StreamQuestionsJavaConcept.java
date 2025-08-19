package prac.basics.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.function.Function.*;

public class StreamQuestionsJavaConcept {

    public static void main(String[] args) {

        // Separate odd and even numbers
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(map);

        map.forEach((x,y) -> {
            System.out.println(x + "-->" + y);
        });

        // Frequency of each character in string
        String sentence = "My name is Prakhar";
        Map<Character, Long> characterLongMap = sentence.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(x->x, Collectors.counting()));
        System.out.println(characterLongMap);

        LinkedHashMap<Character, Long> linkedHashMap = sentence
                                                              .chars()
                                                              .mapToObj(c -> (char) c)
                                                              .collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()));

        // Sort the list in reverse order
        List<Integer> sortList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> reverseSortedList = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(reverseSortedList);

        // Print multiples of 5 from a list
        List<Integer> multipleOfFiveList = Arrays.asList(1, 2, 3, 4, 5);
        multipleOfFiveList.stream().filter( x -> x%5 == 0).forEach(x -> System.out.println(x));

        // Merge two unsorted arrays in single sorted array
        int[] arr1 = { 1,3,2 };
        int[] arr2 = { 4,6,5};
        int[] arr3 = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
        System.out.println("---------------------------------------------------------------------");

        // Three max and min numbers from the list
        List<Integer> listMaxMin = List.of(1,2,3,4,5,6);
        list.stream().sorted().limit(3).forEach(System.out :: println);
        list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out :: println);
        System.out.println("--------------------------------------------------------------------");

        //Sort List of String in incresing order of length
        List<String> stringList = Arrays.asList("Mya", "Name", "Is", "Prakhar");
        stringList.stream().sorted(Comparator.comparing(String :: length)).forEach(System.out :: println);
        stringList.stream().sorted(Comparator.comparing(String :: length,Comparator.reverseOrder())).forEach(System.out :: println);

        System.out.println("Testing ---------------------------------------------------------------");
        stringList.stream().sorted(Comparator.reverseOrder()).forEach(x -> System.out.println(x));

        // Sum and Average of all elements of Array
        List<Integer> sumAndAvgList = Arrays.asList(1, 4, 2, 7, 6, 9);
        IntSummaryStatistics intSummaryStatistics = sumAndAvgList.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getAverage());

        //Last Element of Array
        List<Integer> lastElementList = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().skip(lastElementList.size() - 1).forEach(System.out::println);
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).findFirst().get());

        // Duplicate Elements in Array
        List<Integer> duplicateElementList = Arrays.asList(1, 2, 3,4, 4,5, 5);
        Set<Integer> set = new HashSet<>();
        List<Integer> result = duplicateElementList.stream().filter(x -> !set.add(x)).distinct().collect(Collectors.toList());
        System.out.println(result);

        //Second Largest Element in array
        List<Integer> secondLargestlist = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(secondLargestlist.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        secondLargestlist.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out :: println);

    }
}
