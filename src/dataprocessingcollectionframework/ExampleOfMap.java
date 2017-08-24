package dataprocessingcollectionframework;

import usageclasses.City;
import usageclasses.Person;

import java.util.*;

/**
 * Created by MEHMET on 24.7.2017.
 */
public class ExampleOfMap {

    public static void main(String[] args) {

        /**
         * Map foreach
         */
        City city1 = new City("Barcelona");
        City city2 = new City("Valencia");
        Person person = new Person("Mehmet", "Yılmaz" ,99);
        Person person1 = new Person("Irem", "Yılmaz" ,99);

        Map<City, List<Person>> map = new HashMap<>();
        map.put(city1, Arrays.asList(person));
        map.forEach(
                (city, people) ->
                        System.out.println("Map Foreach : " + city + ": "+ people.size())
        );

        /**
         * Map  getOrDefault
         */
        Map<City, List<Person>> map1 = new HashMap<>();
        map1.put(city1, Arrays.asList(person1));
        System.out.println("Map GetOrDefault : " + map1.getOrDefault(city1, Arrays.asList(person)));
        System.out.println("Map GetOrDefault : " + map1.getOrDefault(city1, Collections.emptyList()));

        /**
         * Map putIfAbsent
         */
        Map<City, List<Person>> map2 = new HashMap<>();
        map2.putIfAbsent(city1,Arrays.asList(person));
        map2.putIfAbsent(city1,new ArrayList<>());
        System.out.println("Map PutIfAbsent : " + map2.get(city1));


        /**
         *  Map computeIfAbsent with map
         */

        Map<String, Map<String, Person>> mapMap = new HashMap<>();

        mapMap.computeIfAbsent(
                "one",
                key -> new HashMap<>()
        ).put("two",person);

        System.out.println("Map ComputeIfAbsent with Map : " + mapMap);

        /**
         * Map computeIfAbsent with list
         */
        Map<String, List<Person>> listMap = new HashMap<>();

        listMap.computeIfAbsent(
                "one",
                key -> new ArrayList<>()
        ).add(person);

        System.out.println("Map ComputeIfAbsent with List : " + listMap);


        /**
         * Map merge
         */
        Map<City, List<Person>> mapListPerson1 = new HashMap<>();
        Map<City, List<Person>> mapListPerson2 = new HashMap<>();

        mapListPerson1.put(city1,Arrays.asList(person));
        mapListPerson2.put(city2,Arrays.asList(person1));
        mapListPerson2.forEach(
                (key, value) ->
                        mapListPerson1.merge(
                                key,value,
                                (existingPeople, newPeople) -> {
                                    existingPeople.addAll(newPeople);
                                    return existingPeople;
                                }
                        )
        );
        System.out.println("Map Merge : " + mapListPerson1);

    }
}
