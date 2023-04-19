package com.sharma.innerClass.regular;

public class RegularInnerClass {
}

class Outer {

    class Inner {
       // public static void main(String[] args) { }
        public void m1inner() {}
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Inner inner = new Outer().new Inner();
        inner.m1inner();
    }
}
