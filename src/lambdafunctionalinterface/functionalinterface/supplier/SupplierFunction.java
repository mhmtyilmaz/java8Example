package lambdafunctionalinterface.functionalinterface.supplier;

import lambdafunctionalinterface.createnewapi.Person;

/**
 * Created by MEHMET on 22.7.2017.
 */
public class SupplierFunction {
    public static void main(String[] args) {

        Supplier<Person> personSupplier1 = () -> new Person();
        Supplier<Person> personSupplier2 = Person::new;
    }
}
