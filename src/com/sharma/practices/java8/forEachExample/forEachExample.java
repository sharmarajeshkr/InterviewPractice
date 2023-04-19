package com.sharma.practices.java8.forEachExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEachExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alex", "Brian", "Charles");

        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        names.forEach(new A());
    }
}

class A implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}










