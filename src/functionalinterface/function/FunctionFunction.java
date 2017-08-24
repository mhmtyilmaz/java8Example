package functionalinterface.function;

import usageclasses.Person;

/**
 * Created by MEHMET on 22.7.2017.
 */
public class FunctionFunction {

    public static void main(String[] args){
        Function<Person, Integer> functional =   person -> person.getAge();
        Function<Person, Integer> functional1 = Person::getAge;
    }
}
