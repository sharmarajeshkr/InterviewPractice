package com.sharma.java8.forEachExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEachExample {
    public static void main(String[] args) {
        //creating sample Collection
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=0; i<10; i++) myList.add(i);

        //traversing using Iterator
       Iterator<Integer> listItr = myList.iterator();
       while (listItr.hasNext()){
           Integer i = listItr.next();
         //  System.out.println("Iterator Value::"+i);
       }

       //traversing through forEach method of Iterable with anonymous class
        myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("forEach anonymous class Value::"+integer);
            }
        });

        myList.forEach(new MyConsumer<Integer>());

    }
}

class MyConsumer<T> implements Consumer<T>{
    @Override
    public void accept(T t) {
        System.out.println("Using My Consumer class "+t);
    }
}
