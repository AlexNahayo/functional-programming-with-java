package programming;

import java.util.Arrays;
import java.util.List;

public class FP01Exercises {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,9,13,4,6,2,4,12,15);
        List<String> courses = Arrays.asList( "Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
    }

    private static void printOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2!=0)
                .forEach(System.out::println);
    }
    private static void printAllCourses(List<String> courses){
        courses.forEach(System.out::println);
    }

    private static void printCoursesWhichContains(List<String> courses , String word){
        courses.stream()
                .filter(course -> course.equals(word))
                .forEach(System.out::println);
    }

    private static void printCoursesWithAtLeast4Characters(List<String> courses){
        courses.stream()
                .filter((String course) -> course.length() >= 4)
                .forEach(System.out::println);
    }
}
