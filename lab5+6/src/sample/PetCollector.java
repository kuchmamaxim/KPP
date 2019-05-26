package sample;

import pets.Pet;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class PetCollector implements Collector<Pet, int[], Integer> {
    @Override
    public Supplier<int[]> supplier() {
        return () -> new int[1];
    }

    @Override
    public BiConsumer<int[], Pet> accumulator() {
        return (result, article) -> result[0] += article.getAge();
    }

    @Override
    public BinaryOperator<int[]> combiner() {
        return (l, r) -> {
            l[0] += r[0];
            return l;
        };
    }

    @Override
    public Function<int[], Integer> finisher() {
        return s -> s[0];
    }

    @Override
    public Set<Characteristics> characteristics() {
        return null;
    }
}
