package lambdafunctionalinterface.createnewapi;

import java.util.function.Function;

/**
 * Created by MEHMET on 22.7.2017.
 */
public class MainComparator {

    public static void main(String[] args){
        //make with Lambda
        Comparator<Person> cmpAge = (p1, p2) -> p2.getAge() - p1.getAge();
        Comparator<Person> cmpFirstName = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
        Comparator<Person> cmpLastName = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());


        //with make method reference
        Function<Person, Integer> f1 = Person::getAge ;
        Function<Person, String> f2 = Person::getLastName;
        Function<Person, String> f3 = Person::getFirstName;

        // with Using Comparator method
        Comparator<Person> cmpPersonAge = Comparator.comparing(Person::getAge);
        Comparator<Person> cmpPersonLastName = Comparator.comparing(Person::getLastName);

        Person personMan = new Person("Mehmet","Yilmaz",28);
        Person personWomen = new Person("Irem","Yilmaz",25);

        Comparator<Person> cmp = cmpPersonAge.thenComparing(cmpPersonAge);


        Comparator<Person> cmpComp = Comparator.comparing(Person::getLastName).thenComparing(Person::getLastName).thenComparing(Person::getAge);

        System.out.println(cmpComp);


    }
}
