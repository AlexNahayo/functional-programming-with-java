package programming;

import java.util.Arrays;
import java.util.List;

public class FP02Exercises {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,9,13,4,6,2,4,12,15);
        int sum =  squareNumberInListAndSum(numbers);
        System.out.println(sum);
    }

    private static int  squareNumberInListAndSum(List<Integer> numbers){
       return numbers.stream()
                .map(number-> number*number)
                .reduce(0, Integer::sum);
    }


}
