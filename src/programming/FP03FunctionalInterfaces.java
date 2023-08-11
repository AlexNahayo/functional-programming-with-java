package programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterfaces {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,9,13,4,6,2,4,12,15);
        numbers.stream()
                .filter(isEvenPredicate())
                .map(squareFunction())
                .forEach(sysoutConsumer());
    }

    private static Consumer<Integer> sysoutConsumer() {
        return System.out::println;
    }

    private static Function<Integer, Integer> squareFunction() {
        return x -> x * x;
    }

    private static Predicate<Integer> isEvenPredicate() {
        return x -> x % 2 == 0;
    }
}
