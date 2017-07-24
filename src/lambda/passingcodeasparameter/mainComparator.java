package lambda.passingcodeasparameter;

import java.util.Comparator;

/**
 * Created by MEHMET on 22.7.2017.
 */
public class mainComparator {
    public  static void main(String[] args){

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return  Integer.compare(s1.length(), s2.length());

            }
        };

        //make with lambda
        Comparator<String> comparatorLambda = (s1,s2) -> {
            System.out.println("I am comparing strings");
            return Integer.compare(s1.length(), s2.length());
        };

    }
}
