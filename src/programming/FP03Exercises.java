package programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FP03Exercises {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,9,13,4,6,2,4,12,15);

        BinaryOperator<Integer> sum1 = Integer::sum;
        BinaryOperator<Integer> sum2 = new BinaryOperator<>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        };
        int sum = numbers.stream().reduce(0 , sum1);
        squareAndPrint( numbers, x -> x * x);
    }

    //Exercise 13
    private static List<Integer> squareAndPrint(List<Integer> numbers, Function<Integer, Integer> function) {
        return numbers.stream()
                .map(function)
                .collect(Collectors.toList());
    }
}
