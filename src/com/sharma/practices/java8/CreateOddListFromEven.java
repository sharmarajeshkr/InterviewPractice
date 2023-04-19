/*
package com.sharma.practices.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateOddListFromEven {
    public static void main(String[] args) {

        //List<Integer> integerList1 = Arrays.asList(1, 2, 3, 4);
        //List<Integer> integerList2 = Arrays.asList(5, 6, 7);
        //Stream stream = Stream.concat(integerList1.stream(), integerList2.stream());

        List <Integer> list =Stream.of(3,1,8,9,4,22,88,10).toList();

        List<Integer> evenList = list.stream().filter(integer -> integer%2 ==0).toList();


        Stream<Integer> stream =  Stream.concat(evenList.stream(), list.stream());

        Set<Integer> integerSet = new HashSet<Integer>();

        List <Integer> oddList  =
                 stream
                         .map(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                         .collect(Collectors.toMap())




                         .toList();
        System.out.println(oddList);


    }
}
*/
