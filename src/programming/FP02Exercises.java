package programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02Exercises {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,9,13,4,6,2,4,12,15);
        List<String> courses = Arrays.asList( "Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
       // lengthOfCourseTitleList(courses);
        System.out.println(lengthOfCourseTitleList(courses));
    }

    private static int  squareNumberInListAndSum(List<Integer> numbers){
       return numbers.stream()
                .map(number-> number*number)
                .reduce(0, Integer::sum);
    }

    private static int  cubeNumberInListAndSum(List<Integer> numbers){
        return numbers.stream()
                .map(number-> number*number*number)
                .reduce(0, Integer::sum);
    }

    private static int  oddNumberInListAndSum(List<Integer> numbers){
        return numbers.stream()
                .filter(number-> number % 2 == 1 )
                .reduce(0, Integer::sum);
    }

    private static int  evenNumberInListAndSum(List<Integer> numbers){
        return numbers.stream()
                .filter(number-> number % 2 == 0 )
                .reduce(0, Integer::sum);
    }

    private static void  distinctNumberInAList(List<Integer> numbers){
      numbers.stream().distinct().forEach(System.out::println);
    }

    private static void  sortNumberInAList(List<Integer> numbers){
        numbers.stream().sorted().forEach(System.out::println);
    }

    private static void  sortAndDistictNumberInAList(List<Integer> numbers){
        numbers.stream().distinct().sorted().forEach(System.out::println);
    }

    private static void  reverseListInAscendingOrder(List<Integer> numbers){
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    public static List<Integer> evenNumberFilteredList(List<Integer> numbers){
        return numbers.stream()
                .filter(number ->  number % 2 == 0)
                .collect(Collectors.toList());
    }

    public static List<Integer> lengthOfCourseTitleList(List<String> courses){
        return courses.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }

}
