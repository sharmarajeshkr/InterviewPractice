package com.sharma.practice;

public class stringandWrapperTest {
    public static void main(String[] args) {
        String a = "Test";
        String b = "Test";
        System.out.println(a==b);

        Integer i = 10;
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);
        System.out.println(i1==i2);

        Integer i5 = new Integer(10);
        System.out.println(i1==i5);


    }
}
