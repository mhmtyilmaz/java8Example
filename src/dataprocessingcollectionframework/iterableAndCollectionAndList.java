package dataprocessingcollectionframework;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * Created by MEHMET on 24.7.2017.
 */
public interface iterableAndCollectionAndList<E> {

    // On Iterable
    boolean foreach(Consumer<? super E> consumer);

    // On Collection
    boolean removeIf(Predicate<? super E> filter);

    // On List
    boolean replaceAll(UnaryOperator<? super E> operator);
    boolean sort(Comparator<? super E> comparator);
}
