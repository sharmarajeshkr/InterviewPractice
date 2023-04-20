package com.sharma.practices.java8.map;

import com.sharma.practices.java8.Student;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class A {
    public static void main(String[] args) {
        sortValueByMap();
        //sortValueByMap();
        // sortByKey();
        // sortByValue();
        // sortByValueAndReturnMap();
        //sortByValueAndReturnMapDescendingOrder();
        // sortingMapByValueInJava8();
    }

    static void sortingMapByValueInJava8() {
        // Creating a Map with electoric items and prices
        Map<String, Integer> ItemToPrice = new HashMap<>();
        ItemToPrice.put("Sony Braiva", 1000);
        ItemToPrice.put("Apple iPhone 6S", 1200);
        ItemToPrice.put("HP Laptop", 700);
        ItemToPrice.put("Acer HD Monitor", 139);
        ItemToPrice.put("Samsung Galaxy", 800);
        ItemToPrice.put("Acer HD Monitor", 1394);
        ItemToPrice.put("A", 2);
        ItemToPrice.put("A", 4);

        // Type of way to iterate map

        ItemToPrice
                .entrySet()
                .forEach(System.out::println);

        System.out.println("unsorted Map: " + ItemToPrice);

        Map<String, Integer> itemsToPrice =
                ItemToPrice.entrySet()
                        .stream()
                        .sorted(Map.Entry.<String, Integer>comparingByValue())
                        .collect (
                                Collectors.toMap(Map.Entry::getKey , Map.Entry:: getValue
                                , (e1,e2)->e2 , LinkedHashMap::new)
                        );

        System.out.println(itemsToPrice);
    }


    static void sortByValueAndReturnMapDescendingOrder() {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("One", 1);
        unsortedMap.put("Ten", 10);
        unsortedMap.put("Five", 5);
        unsortedMap.put("Two", 2);
        unsortedMap.put("Seven", 7);
        unsortedMap.put("Three", 3);
        unsortedMap.put("Six", 6);
        unsortedMap.put("Eight", 8);
        System.out.println("Original Map");
        System.out.println(unsortedMap);

        Map<String,Integer> sortedByValue =
        unsortedMap.entrySet()
                        .stream()
                                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                                        .collect(
                                           toMap(Map.Entry::getKey,
                                                   Map.Entry::getValue,
                                                   (e1,e2) -> e1, LinkedHashMap::new)
                                        );


        System.out.println(sortedByValue);
    }

    static void sortByValueAndReturnMap() {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("One", 1);
        unsortedMap.put("Ten", 10);
        unsortedMap.put("Five", 5);
        unsortedMap.put("Two", 2);
        unsortedMap.put("Seven", 7);
        unsortedMap.put("Three", 3);
        unsortedMap.put("Six", 6);
        unsortedMap.put("Eight", 8);
        System.out.println("Original Map");
        System.out.println(unsortedMap);

        Map<String, Integer> sortedByValue =
                unsortedMap.entrySet()
                        .stream()
                        .sorted(Map.Entry.<String, Integer>comparingByValue())
                        .collect(
                                toMap(
                                        Map.Entry::getKey,
                                        Map.Entry::getValue,
                                        (e1, e2) -> e1, LinkedHashMap::new
                                )
                        );
        System.out.println(sortedByValue);
    }
    static void sortByValue() {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("One", 1);
        unsortedMap.put("Ten", 10);
        unsortedMap.put("Five", 5);
        unsortedMap.put("Two", 2);
        unsortedMap.put("Seven", 7);
        unsortedMap.put("Three", 3);
        unsortedMap.put("Six", 6);
        unsortedMap.put("Eight", 8);
        System.out.println("Original Map");
        System.out.println(unsortedMap);
        // Sort by key
        System.out.println("Map:- Sorted by value");
        unsortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);


    }

    static void sortByKey() {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("One", 1);
        unsortedMap.put("Ten", 10);
        unsortedMap.put("Five", 5);
        unsortedMap.put("Two", 2);
        unsortedMap.put("Seven", 7);
        unsortedMap.put("Three", 3);
        unsortedMap.put("Six", 6);
        unsortedMap.put("Eight", 8);

        System.out.println(unsortedMap);
        // Sort by value

        unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(vl -> System.out.println(vl));


    }


    // How to Sort Map by values on Increasing order
    //
    //Read more: https://www.java67.com/2017/07/how-to-sort-map-by-values-in-java-8.html#ixzz7wu8iUoBT
    static void sortValueByMap() {
        Map<String, Student> map = new HashMap<String, Student>();
        //Adding elements to map
        map.put("FIVE", new Student("Programming", "Kyle", "Miller", "Miami", 20));
        map.put("FOUR", new Student("Math", "James", "Robertson", "Miami", 20));
        map.put("TWO", new Student("Programming", "Mike", "Miles", "New York", 21));
        map.put("THREE", new Student("Math", "Michael", "Peterson", "New York", 20));
        map.put("ONE", new Student("Math", "John", "Smith", "Miami", 19));

        map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Student>comparingByValue(
                        (o1, o2) -> o1.getSubject().compareTo(o2.getSubject()))
                )
                .collect(
                        Collectors.toMap( Map.Entry::getKey, Map.Entry::getValue,
                                (e1,e2)-> e1 , LinkedHashMap:: new)
                        )

                .entrySet()
                .forEach(System.out::println);


    }
}
