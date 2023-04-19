package com.sharma.practices.java8;

import com.sharma.practices.java8.functionalInterface.C;

public class MNP implements C {

    public static void main(String[] args) {
        C c = () -> System.out.println("Methos 1");
        c.methodOne();
        c.a1();
        C.a2();
    }

    @Override
    public void methodOne() {
        // TODO Auto-generated method stub

    }


}
