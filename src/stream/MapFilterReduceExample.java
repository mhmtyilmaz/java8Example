package stream;

import usageclasses.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by MEHMET on 30.7.2017.
 */
public class MapFilterReduceExample {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Alice", "Balia", 25),
                new Person("Brain", "Cbial", 20),
                new Person("Chelsea", "Ghia", 15),
                new Person("David", "Vhayh", 18),
                new Person("Erica", "Babam", 21),
                new Person("Francesco", "Edrian", 20)
        );

        // Return age
        persons.stream()
                .map(Person::getAge)
                .filter(age -> age > 20)
                .forEach(System.out::println);

        // Return object
        persons.stream()
                .filter(p -> p.getAge() > 20)
                .forEach(System.out::println);


        // Return object
        persons.stream()
                .map(Person::getAge)
                .peek(System.out::println)
                .filter(age -> age > 20)
                .forEach(System.out::println);

        persons.stream()
                .skip(2)
                .limit(3)
                .filter(person -> person.getAge() > 20)
                .forEach(System.out::println);

        boolean resultMatch =
        persons.stream()
                .allMatch(person -> person.getAge() > 20);
        System.out.println(resultMatch);

        boolean resultNonMatch =
        persons.stream()
                .noneMatch(person -> person.getAge() > 20);
        System.out.println(resultNonMatch);


        Optional<Person> opt =
                persons.stream().findFirst();

        persons.stream().findAny();






    }
}
