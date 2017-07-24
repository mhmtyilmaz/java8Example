package functionalinterface.predicate;

/**
 * Created by MEHMET on 22.7.2017.
 */
public interface BiPredicate<T, U> {
    public boolean test(T t, U u);
}
