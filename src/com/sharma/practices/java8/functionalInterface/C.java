package com.sharma.practices.java8.functionalInterface;

@FunctionalInterface
interface A {
    public void methodOne();

    public default void a1() {
        System.out.println("Parent Class Default Methods");
    }

    public static void a2() {
        System.out.println("Parent Class Static Methods");
    }

}

@FunctionalInterface
public interface C extends A {
    // public void methodTwo();
    public default void a1() {
        System.out.println("Child Class Default Methods");
    }

    public static void a2() {
        System.out.println("Child Class static Methods");
    }
}


interface B {
    public void methodOne();

    public void methodTwo();

}
