package examples.example2;

import usageclasses.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by MEHMET on 24.7.2017.
 */
public class MainAPICollection {

    public static void main(String[] args) {
        Person p1 = new Person("John","Bakhi",30);
        Person p2 = new Person("Tom","Lorna",24);
        Person p3 = new Person("Jeff","Biatio",21);
        Person p4 = new Person("Angel","Limna",15);
        Person p5 = new Person("Erin","Nossa",56);
        Person p6 = new Person("Ashley","Bil",35);

        List<Person> people = new ArrayList(Arrays.asList(p1,p2,p3,p4,p5,p6));

        /**
         * Using RemoveIf
         */
        people.removeIf(person -> person.getAge() < 21);

        /**
         * Using replaceAll
         */
        people.replaceAll(person -> new Person(
                person.getFirstName().toUpperCase(),
                person.getLastName().toLowerCase(),
                person.getAge())
        );

        /**
         * Using sort (data show desc)
         * Using reversed (data show asc)
         */
        people.sort(Comparator.comparing(Person::getAge).reversed());

        /**
         * Using forEach
         */
        people.forEach(System.out::println);
    }

}
