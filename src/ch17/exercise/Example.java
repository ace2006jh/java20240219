package ch17.exercise;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "java8 supports lambda expression"
        );
        list.stream()
                .filter(s -> s.matches(".*[jJ][aA][vV][aA].*"))
                .forEach(System.out::println);
    }
}
