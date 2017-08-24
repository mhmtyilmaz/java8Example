package stream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by MEHMET on 30.7.2017.
 */
public class StreamExample2 {

    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4);
        Stream<Integer> stream1 = ints.stream();
        Stream<Integer> stream2 = Stream.of(0, 1, 2, 3, 4);
        stream2.forEach(System.out::println);
        stream1.forEach(System.out::println);


        Stream<String> streamOfStrings = Stream.generate(() -> "one");
        streamOfStrings.limit(5).forEach(System.out::println);


        Stream<String> streamOfString2 = Stream.iterate("+", s -> s + "+");
        streamOfString2.limit(5).forEach(System.out::println);


        IntStream streamOfInt = ThreadLocalRandom.current().ints();
        streamOfInt.limit(5).forEach(System.out::println);


    }
}
