package com.sharma.practices.java8;

@FunctionalInterface
interface AddNumber {
    public void add(int a, int b);
}

public class Adding2Number {
    public static void main(String[] args) {
        // Using Anonymous Class
        AddNumber num = new AddNumber() {
            @Override
            public void add(int a, int b) {
                System.out.println(a+b);
            }
        };
        num.add(5,6);

        // Using Lambda Expression
        AddNumber an = (a, b) -> System.out.println("addition of two Number " + (a + b));
        an.add(2, 6);
    }

}
