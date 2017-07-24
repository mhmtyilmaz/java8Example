package dataprocessingcollectionframework;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by MEHMET on 24.7.2017.
 */
public interface map<K,V> {

    // On Map
    void foreach(BiConsumer<? super K, ? super V> consumer);

    V getOrDefault(Object key, V defaultValue);

    V putIfAbsent(K key, V value);

    V replace(K key, V newValue);

    boolean replace(K key, V existingValue, V newValue);

    void replaceAll(BiFunction<? super K, ? super V, ? extends V> function);

    void remove(Object key, Object value);

    void compute(
         K key, BiFunction<? super K, ?  super V, ? extends V> remapping
    );

    V computeIfAbsent(K key,
                      Function<? super K, ? extends V> mapping);

    V computeIfPresent(
            K key, BiFunction<? super K, ? super V, ? extends V> remapping
    );

    V merge(
      K key, V newValue,
      BiFunction<? super V, ? super V, ? extends V> remapping
    );
}
