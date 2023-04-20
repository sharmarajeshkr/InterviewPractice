package com.sharma.practices.java8;

interface SquareInterface {
    public int square(int x);
}

public class ABC {
    public static void main(String[] args) {
        SquareInterface i = x -> x * x;
        System.out.println("The Square of 5 is:" + i.square(5));
    }
}