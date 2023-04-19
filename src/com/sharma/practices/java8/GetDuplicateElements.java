package com.sharma.practices.java8;

import java.util.*;
import java.util.stream.Collectors;

public class GetDuplicateElements {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet();

        List<Integer> myList11 =
        myList.stream()
                .filter(i-> !set.add(i))
                .collect(Collectors.toList());
        System.out.println(myList11);

    }
}
