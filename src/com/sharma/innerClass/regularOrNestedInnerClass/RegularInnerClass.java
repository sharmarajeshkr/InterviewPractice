package com.sharma.innerClass.regularOrNestedInnerClass;

public class RegularInnerClass {
    public static void main(String[] args) {
        // Calling outer class Method
        Outer outer = new Outer();
        System.out.println(outer.addValues(3, 5));

        // Calling inner class method
        Outer.Inner inner = new Outer().new Inner();
        inner.m1inner();
    }
}

class Outer {
    public int addValues(int a, int b) {
        return a + b;
    }

    class Inner {
        // public static void main(String[] args) { }
        public void m1inner() {
            System.out.println("Inner class method called");
        }
    }
}
