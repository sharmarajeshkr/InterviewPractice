package com.sharma.java8.forEachExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class SortedMapExample {
    public static void main(String[] args) {

        // Creating a Map with electoric items and prices
        Map<String, Integer> ItemToPrice = new HashMap<>();
        ItemToPrice.put("Sony Braiva", 1000);
        ItemToPrice.put("Apple iPhone 6S", 1200);
        ItemToPrice.put("HP Laptop", 700);
        ItemToPrice.put("Acer HD Monitor", 139);
        ItemToPrice.put("Samsung Galaxy", 800);

        System.out.println("unsorted Map: " + ItemToPrice);

        System.out.println("\n Iterate Using for loop Normal");
        for (Map.Entry<String,Integer> entry  : ItemToPrice.entrySet())
            System.out.println( "Key "+entry.getKey() + "\t Value "+entry.getValue());

        System.out.println("###################################");


        System.out.println("\n Iterate Using Iterator Normal");
           Iterator itr =  ItemToPrice.entrySet().iterator();
           while (itr.hasNext()){
               Map.Entry entry= (Map.Entry) itr.next();
               System.out.println( "Key "+entry.getKey() + "\t Value "+entry.getValue());
           }

        System.out.println("###################################");
        System.out.println("\n Iterate Using forEach");
        ItemToPrice.forEach(
                (key,value) -> System.out.println( "Key "+key + "\t Value "+value)
        );


        System.out.println("###################################");

        // sorting Map by values in ascending order, price here
        ItemToPrice.entrySet().stream()
                .sorted(Map.Entry.<String, Integer> comparingByValue())
                .forEach(System.out::println);
        // Sorted By Key
        System.out.println("Sorted By Key");
        ItemToPrice.entrySet().stream()
                .sorted(Map.Entry.<String, Integer> comparingByKey())
                .forEach(System.out::println);


        System.out.println("###########################################################");


        // now, let's collect the sorted entries in Map
        // the Map returned by the previous statement was not sorted
        // because ordering was lost while collecting result in Map
        // you need to use the LinkedHashMap to preserve the order

        /*  Map<String, Integer> sortedByPrice
                = ItemToPrice.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer> comparingByValue())
                    .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
             System.out.println("sorted Map: " +sortedByPrice);
         */

        Map<String, Integer> sortedByKey = ItemToPrice .entrySet() .stream()
                .sorted(Map.Entry.<String, Integer> comparingByKey())
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println("sorted Map: " +sortedByKey);


        Map<String, Integer> sortedByValue = ItemToPrice .entrySet() .stream()
                .sorted(Map.Entry.<String, Integer> comparingByValue())
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        System.out.println("sorted Map: " +sortedByValue);


    }
}
