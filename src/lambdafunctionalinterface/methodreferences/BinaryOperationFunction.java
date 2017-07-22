package lambdafunctionalinterface.methodreferences;

import java.util.function.BinaryOperator;

/**
 * Created by MEHMET on 22.7.2017.
 */
public class BinaryOperationFunction  {

    public static void main(String[] args){

        BinaryOperator<Integer> sum = (i1,i2) -> i1 + i2;

        //make clean code
        BinaryOperator<Integer> sumInt = (i1,i2) -> Integer.sum(i1, i2);

        //with method reference
        BinaryOperator<Integer> sumMR = Integer::sum;
        BinaryOperator<Integer> max = Integer::max;
    }
}
