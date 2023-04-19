package com.sharma.java8.forEachExample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> listNames = Arrays.asList("Alex", "Brian", "Charles");
        System.out.println("New Implementation");
        //1 . For each example for list using Consume (Functional Interface)
        listNames.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // 2 . Directly using foreach
        listNames.forEach(System.out :: println);
        System.out.println("New Implementation");

        listNames.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("#############Calling Using Custom Implementation##############");
        listNames.forEach(new CustomConsumerImpl());

        System.out.println("#############Calling Map##############");
        Map<String, String> map = new HashMap<String, String>();
        map.put("C", "Charles");
        map.put("E", "Charles Nmw");
        map.put("A", "Alex");
        map.put("B", "Brian");
        map.put("D", "Nmaso Charles");


        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println("key and value " + key + " " + value);
            }
        });
        System.out.println("#############Calling Using Custom Implementation##############");
        map.forEach(new CustomBiConsumerImpl());

        System.out.println("##############Get key from Map ###############");
        Consumer<String> actionKeys = System.out::println;
        map.keySet().forEach(actionKeys);


        System.out.println("##############Get Values from Map ###############");
        Consumer<String> actionValues = System.out::println;
        map.values().forEach(actionValues);
    }
}

class CustomConsumerImpl implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class CustomBiConsumerImpl implements BiConsumer<String, String> {
    @Override
    public void accept(String key, String value) {
        System.out.println("key and value " + key + " " + value);
    }
}