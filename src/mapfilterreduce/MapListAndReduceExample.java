package mapfilterreduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Created by MEHMET on 30.7.2017.
 */
public class MapListAndReduceExample {

    public static void main(String[] args) {

        List<Integer> ıntegers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> ıntegers1 = Arrays.asList(0, 1, 2, 3, 4);
        List<Integer> ıntegers2 = Arrays.asList(5, 6, 7, 8, 9);

        BinaryOperator<Integer> op = (i1, i2) -> i1 + i2;
        BinaryOperator<Integer> opMax = Integer::max;
        BinaryOperator<Integer> opAvg = (i1, i2) -> (i1 + i2)/2;

        int reduction1 = reduce(ıntegers1, 4 , op);
        int reduction2 = reduce(ıntegers2, 0 , op);
        int reduction = reduce(Arrays.asList(reduction1,reduction2), 0 , op);
        int red = reduce(ıntegers, 0, op);
        int redMax = reduce(ıntegers, 0, opMax);
        int redAvg = reduce(ıntegers, 0, opAvg);

        System.out.println("Reduction : "+ red);
        System.out.println("Reduction : "+ reduction1);
        System.out.println("Reduction : "+ reduction2);
        System.out.println("Reduction : "+ reduction);
        System.out.println("Reduction : "+ redMax);
        System.out.println("Reduction : "+ redAvg);
    }

    public static int reduce(List<Integer> values,
                             int valueIfEmpty,
                             BinaryOperator<Integer> reduction) {
        int result = valueIfEmpty;
        for (int value : values) {
            result = reduction.apply(result, value);
        }
        return  result;
    }
}
