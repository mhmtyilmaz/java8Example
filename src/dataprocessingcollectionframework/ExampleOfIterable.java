package dataprocessingcollectionframework;

import usageclasses.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by MEHMET on 24.7.2017.
 */
public class ExampleOfIterable {

    public static void main(String[] args) {
        /**
         * Iterable forEach and removeIf
         */
        List<Person> people = new ArrayList<>();
        Person person1 = new Person("Test", "Best", 19);
        Person person2 = new Person("Test", "Best", 21);
        people.add(person1);
        people.add(person2);
        people.forEach(System.out::println);
        people.removeIf(person -> person.getAge() < 20);
        System.out.println("Iterable foreach and removeIf : " + people.size());


        /**
         *   Iterable  replaceAll and sort
         */
        List<String> names = new ArrayList<>();
        names.add("test");
        names.replaceAll(String::toUpperCase);
        System.out.println("Iterable replaceAll : " + names.get(0));

        List<Person> peopleSort = new ArrayList<>();
        peopleSort.add(person1);
        peopleSort.add(person2);

        peopleSort.sort(
                Comparator.comparing(Person::getFirstName)
                        .thenComparing(Person::getAge)
        );
        System.out.println("Iterable replaceAll : " + peopleSort);

    }
}
