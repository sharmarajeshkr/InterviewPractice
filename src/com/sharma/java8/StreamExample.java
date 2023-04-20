package com.sharma.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {


        // Stream()

        /*
         flatMap() = map() + Flattening
         Flattening : Flattening is referred by converting several lists of lists,
         and merge all those lists to create single list containing all the elements from all the lists.

        Flattening example
            Before flattening   : [[1, 2, 3], [4, 5], [6, 7, 8]]
            After flattening    : [1, 2, 3, 4, 5, 6, 7, 8]
        */

        //  Convert list of lists to single list

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> list3 = Arrays.asList(7, 8, 9);

        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);


        List<Integer> listOfAllIntegers =
                listOfLists.stream()
                        .flatMap(x -> x.stream())
                        .collect(Collectors.toList());

        System.out.println(listOfAllIntegers);

        // converting array of Arrays to single list

        String[][] dataArray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};
        List<String> listOfAllChars =
                Arrays.stream(dataArray).flatMap(
                        x -> Arrays.stream(x)
                ).collect(
                        Collectors.toList()
                );

        System.out.println(listOfAllChars);


        // Find or remove duplicates from List
        System.out.println("Find or remove duplicates from List");

        // ArrayList with duplicate elements
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
        System.out.println("Original values " + numbersList);
        List<Integer> listWithoutDuplicates =
                numbersList.stream()
                        .distinct()
                        .collect(Collectors.toList());
        System.out.println("After Removing Duplicate values " + listWithoutDuplicates);
        // Collectors.toSet() to remove duplicates
        Set<Integer> setWithoutDuplicate =
                numbersList.stream()
                        .collect(Collectors.toSet());
        System.out.println("Remove duplicate using toSet() " + setWithoutDuplicate);
    }


    public static void Stream() {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        // Intermediate Operation
        // 1. Filter Example
        List<String> filterName = memberNames.stream()
                        .filter( name -> (name.startsWith("A") || name.startsWith("S")) )
                        .collect(Collectors.toList());
        System.out.println(filterName);

        // 2. Map Intermediate operator is used to convert one object type yo another object
        // via the provided function
        // Example : Accept List of string and convert only  name's start with "A" to uppercase
        List<String> mapNameUpperCase =
                memberNames.stream().filter(name -> name.startsWith("A"))
                        .map( name -> name.toUpperCase() )
                        .collect(Collectors.toList());
        System.out.println(mapNameUpperCase);

        // 3. Sorted : Sorted is an intermediate operation that returns a sorted view of the stream.
        //  The elements are sorted in natural order unless you pass a custom Comparator.

        memberNames.stream()
                .sorted().forEach(System.out::println);

    }


    public static void streamMain() {
        Stream<String> s = Stream.of("HI", "pawan", "sharma", "hey");
        // List of elements
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 10; i++)
            list.add(i);

        // List to Stream
        Stream<Integer> slist = list.stream();
        // or
        List<Integer> listEvenNumbers =
                list.stream().filter(
                        i -> i % 2 == 0
                ).collect(
                        Collectors.toList()
                );
        System.out.println(listEvenNumbers);
    }
}
