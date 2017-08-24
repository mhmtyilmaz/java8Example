package functionalinterface.function;

/**
 * Created by MEHMET on 22.7.2017.
 */
public interface BiFunction<T, V, R> {
    public R apply(T t, V v);
}
