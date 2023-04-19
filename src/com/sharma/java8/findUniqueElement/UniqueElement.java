package com.sharma.java8.findUniqueElement;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueElement {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5);
        System.out.println("The distinct elements are :");

        // Displaying the distinct elements in the list
        // using Stream.distinct() method
        list.stream().distinct().forEach(System.out::println);

        System.out.println("The distinct elements are Using toSet():");

        Set<Integer> uniqueElement= list.stream().collect(Collectors.toSet());
        uniqueElement.forEach(System.out :: println);

        List<Integer> uniqueListElements =
        list.parallelStream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueListElements);


    }

}
