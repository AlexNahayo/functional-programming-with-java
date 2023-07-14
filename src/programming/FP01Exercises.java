package programming;

import java.util.Arrays;
import java.util.List;

public class FP01Exercises {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,9,13,4,6,2,4,12,15);
        List<String> courses = Arrays.asList( "Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
    }

    //Exercise 1
    private static void printOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2!=0)
                .forEach(System.out::println);
    }

    //Exercise 2
    private static void printAllCourses(List<String> courses){
        courses.forEach(System.out::println);
    }

    //Exercise 3
    private static void printCoursesWhichContains(List<String> courses , String word){
        courses.stream()
                .filter(course -> course.equals(word))
                .forEach(System.out::println);
    }

    //Exercise 4
    private static void printCoursesWithAtLeast4Characters(List<String> courses){
        courses.stream()
                .filter((String course) -> course.length() >= 4)
                .forEach(System.out::println);
    }

    private static void printSquareOfEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }

    //Exercise 5
    private static void printCubeOfOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> (int) Math.pow(number, 3))
                //.map(number -> number*number*number)
                .forEach(System.out::println);
    }

    //Exercise 6
    private static void printNumberOfCharactersInEachCourseName(List<String> courses) {
        courses.stream()
                .map(String::length)
                .forEach(System.out::println);
    }


}
