package com.sharma.practices.java8.forEachExample;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class forEachExampleMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("A", "Alex");
        map.put("B", "Brian");
        map.put("C", "Charles");

        map.forEach( (key, Value) -> System.out.println( key +"--" +Value) );



       /* map.forEach( (k, v) -> {
            System.out.println("Keys and Values " + k + "  " + v);
            // System.out.println("Values "+v);
        });*/
        System.out.println("Using Custom Implementation for BiConsumer");
        map.forEach(new BiConsumerImpl());

        System.out.println("--------");
        //1. Map Values
       // Consumer<String> actionOnValues = System.out::println;
        map.values().forEach(System.out::println);
        //2. Map keys
        //Consumer<String> actionOnKeys = System.out::println;
        map.keySet().forEach(System.out::println);
    }

}

class BiConsumerImpl implements BiConsumer<String, String> {

    @Override
    public void accept(String t, String u) {
        System.out.println("Keys and Values " + t + "  " + u);
    }
}









