package com.sharma.java8.predicateExample;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateExample {
    public static void main(String[] args) {
        // List.of("Groovy", "Gradle", "Grails", "Micronaut", "Java", "Kotlin");
        Stream<String> si = Stream.of("Groovy", "Gradle", "Grails", "Micronaut", "Java", "Kotlin");
        si.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        List<String> filterData = si.filter(s -> s.startsWith("Gr") || s.startsWith("K"))
                .collect(Collectors.toList());
        System.out.println(filterData);


    }
}
