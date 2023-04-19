package com.sharma.practices.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("HI", "pawan", "sharma", "hey");

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        System.out.println("Converting List to Stream");
        Stream<Integer> i = list.stream();
        // or
        List<Integer> evennumber = list.stream().filter(n -> (n % 2 == 0))
                .collect(Collectors.toList());

        System.out.println(evennumber);

    }

}
