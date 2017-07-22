package lambdafunctionalinterface.functionalinterface.pradicate;

import lambdafunctionalinterface.createnewapi.Person;

/**
 * Created by MEHMET on 22.7.2017.
 */
public class PradicateFunction {

    public static void main(String[] args) {

        Predicate<String> p = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() < 20;
            }
        };

        // with make lambda
        Predicate<String> predicate = s -> s.length() < 20;
        predicate.test("Test");

        Predicate<Person> personPredicate = person -> person.getAge() > 20;

    }



}
