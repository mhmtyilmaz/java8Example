package mapfilterreduce;

import usageclasses.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Created by MEHMET on 30.7.2017.
 */
public class ReductionOfSingleton {
    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(1, 1);
        int sum = 0;
        BinaryOperator<Integer> op = Integer::sum;
        for (int i : ints) {
            sum = op.apply(sum, i);
        }
        System.out.println(sum);



        List<Integer> intsMax = Arrays.asList(1, 2);
        int max = 0;
        BinaryOperator<Integer> opMax = Integer::max;
        for (int n : intsMax) {
            max = opMax.apply(max, n);
        }
        System.out.println(max);

        List<Person> people = Arrays.asList(
                new Person("Mehmet","yILMAZ",25),
                new Person("Mehmet","yILMAZ",22),
                new Person("Mehmet","yILMAZ",20)
        );
            people.stream().map(p -> p.getAge())
                .filter(age -> {

                    return age > 20;
                });



    }
}
