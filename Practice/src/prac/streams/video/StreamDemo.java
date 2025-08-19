package prac.basics.streams.video;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // feature introduced in Java 8
        // process collections of data in a functional and declarative manner
        // Simplify Data Processing
        // Embrace Functional Programming
        // Improve Readability and Maintainability
        // Enable Easy Parallelism

        //// What is stream ?
        // a sequence of elements supporting functional and declarative programing

        //// How to Use Streams ?
        // Source, intermediate operations & terminal operation

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());

        //// Creating Streams
        // 1. From collections
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();


        // 2. From Arrays
        int[] arr = {1,2,3};
        IntStream intStream = Arrays.stream(arr);
        String[] array = {"a", "b", "c"};
        Stream<String> stringStream = Arrays.stream(array);

/*
        Arrays.stream(int[]) returns a primitive stream: IntStream

        Arrays.stream(String[]) returns a generic object stream: Stream<String>

        Reason for Difference
        Java has primitive streams (like IntStream, LongStream, DoubleStream) for performance reasons—avoiding boxing/unboxing of primitives.

        But String[] is an array of reference types (objects), so Java returns a Stream<T>.
*/

/*        Boxing Consideration
        If you want to use a Stream<Integer> instead of IntStream, you need to box the primitives:

        Stream<Integer> boxedStream = Arrays.stream(arr).boxed();
        But this is less efficient than working with IntStream directly.

*/


        // 3. Using Stream.of()
        Stream<String> stream2 = Stream.of("a", "b");

        // 4. Infinite streams
        Stream.generate(() -> 1).limit(5).forEach( x -> System.out.println(x));
        Stream.generate(() -> "Prakhar").limit(10).forEach(System.out :: println);
        Stream.iterate(5, x -> x + 1).limit(10).forEach( x-> System.out.println(x));
    }
}
