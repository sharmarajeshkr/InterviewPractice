package com.sharma.practices.java8.functionalInterface;

public class ClientCode {
    public static void main(String[] args) {
        AddTest t = (i,j)-> {
            return i+j;  };


        int o = t.add(3,5);
        System.out.println(o);
    }
}
