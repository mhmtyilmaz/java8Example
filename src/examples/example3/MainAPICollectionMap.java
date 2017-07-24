package examples.example3;

import usageclasses.City;
import usageclasses.Person;

import java.util.*;

/**
 * Created by MEHMET on 24.7.2017.
 */
public class MainAPICollectionMap {
    public static void main(String[] args) {


        Person p1 = new Person("John", "Bakhi", 30);
        Person p2 = new Person("Tom", "Lorna", 24);
        Person p3 = new Person("Jeff", "Biatio", 21);
        Person p4 = new Person("Angel", "Limna", 15);
        Person p5 = new Person("Erin", "Nossa", 56);
        Person p6 = new Person("Ashley", "Bil", 35);

        City newYork = new City("New York");
        City rome = new City("Rome");
        City barcelona = new City("Barcelona");

        Map<City, List<Person>> cityListMap = new HashMap<>();

        /**
         * Using putIfAbsent
         */
        cityListMap.putIfAbsent(barcelona, new ArrayList<>());
        cityListMap.get(barcelona).add(p1);

        /**
         * Using computeIfAbsent
         */
        cityListMap.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p2);
        cityListMap.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p3);


        Map<City, List<Person>> map1 = new HashMap<>();
        map1.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p1);
        map1.computeIfAbsent(rome, city -> new ArrayList<>()).add(p2);
        map1.computeIfAbsent(rome, city -> new ArrayList<>()).add(p3);

        System.out.println("Map 1");
        map1.forEach((city, people) -> System.out.println(city + " : " + people));

        Map<City, List<Person>> map2 = new HashMap<>();
        map2.computeIfAbsent(rome, city -> new ArrayList<>()).add(p4);
        map2.computeIfAbsent(barcelona, city -> new ArrayList<>()).add(p5);
        map2.computeIfAbsent(barcelona, city -> new ArrayList<>()).add(p6);

        System.out.println("Map 2");
        map2.forEach((city, people) -> System.out.println(city + " : " + people));


        /**
         * using merge
         */

        map2.forEach(
                (city, people) -> {
                    map1.merge(
                            city, people,
                            (peopleFromMap1, peopleFroMap2) -> {
                                peopleFromMap1.addAll(peopleFroMap2);
                                return peopleFromMap1;
                            }
                    );
                }
        );

        System.out.println("Merged Map1");
        map1.forEach(
                (city,people) -> System.out.println(city + " : " + people)
        );


        /**
         * Using getOrDefault (if use cityListMap.get(barcelona) it returns null which is not good )
         * getOrDefault.get(barcelona, Collections.emptyList()) return []
         */
        System.out.println("People from Barcelona : " + cityListMap.getOrDefault(barcelona, Collections.emptyList()));
        System.out.println("People from New York : " + cityListMap.getOrDefault(newYork, Collections.emptyList()));

    }
}