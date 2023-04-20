package com.sharma.innerClass.staticInner;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.m1();

        // Calling static m2 method from inner class
        Outer.Inner.m2();

        Outer.Inner nested = new Outer.Inner();
        nested.my_method();
    }
}


class Outer {

    public void m1() {
        System.out.println("Outer Class Instance Method ");
    }

    public static void m2() {
        System.out.println("Outer Class Static Method");
    }
    // Calling inner class method from Outer class
    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.m1();
        Inner.m2();
    }

    static class Inner {
        public static void main(String[] args) {
            Inner inner = new Inner();
            inner.m1();
            Inner.m2();

            Outer o = new Outer();
            o.m1();
            Outer.m2();

        }
        public void m1() {
            System.out.println("Inner Class Instance Method ");
        }

        public static void m2() {
            System.out.println("Inner Class Static Method");
        }

        public void my_method() {
            System.out.println("Hi");
        }
    }


}