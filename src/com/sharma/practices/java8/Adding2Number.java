package com.sharma.practices.java8;

@FunctionalInterface
interface AddNumber {
    public void add(int a, int b);
}

public class Adding2Number {
    public static void main(String[] args) {
        AddNumber an = (a, b) -> System.out.println("addition of two Number " + (a + b));
        an.add(2, 6);
    }

}
