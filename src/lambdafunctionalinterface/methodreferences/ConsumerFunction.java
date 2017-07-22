package lambdafunctionalinterface.methodreferences;

import java.util.function.Consumer;

/**
 * Created by MEHMET on 22.7.2017.
 */
public class ConsumerFunction {

    public static void main(String[] args) {
        Consumer<String> printer = s -> System.out.println(s);

        //with method reference
        Consumer<String> printerMR = System.out::println;
    }
}
