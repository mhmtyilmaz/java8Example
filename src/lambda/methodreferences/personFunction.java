package lambda.methodreferences;

import java.util.function.Function;

/**
 * Created by MEHMET on 22.7.2017.
 */
public class personFunction {

    public static void main (String[] args){
        //with Lambda
        Function<Person,Integer> f = person -> person.getAge();

        //with Method reference
        Function<Person,Integer> f1 = Person::getAge;
    }
}
