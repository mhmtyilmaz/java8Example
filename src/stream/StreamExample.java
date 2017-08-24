package stream;

import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by MEHMET on 30.7.2017.
 */
public class StreamExample {

    public static void main(String[] args) {

        Stream.empty();

        Stream.of("one");

        Stream.of("one", "two", "three");

        Stream.generate(() -> "one");
        Stream.iterate("+", s -> s + "+");

        ThreadLocalRandom.current().ints();

        IntStream stream = "hello".chars();

        Stream<String> works =
                Pattern.compile("[^\\p{javaLetter}]")
                .splitAsStream("1");

        Stream.Builder<String> builder = Stream.builder();

        builder.add("one").add("two").add("three");
        builder.accept("four");

        Stream<String> stream1 = builder.build();

        stream1.forEach(System.out::println);


    }
}
