package com.sharma.innerClass.staticInner;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.m1();

       // Outer.Nested_Demo nested = new Outer.Nested_Demo();
       // nested.my_method();
    }
}


class Outer {

    public void m1(){
        System.out.println("Outer Class Instance Method ");
    }
    public  static void m2(){
        System.out.println("Outer Class Static Method");
    }

    /*public static void main(String[] args) {
        Inner inner = new Inner();
        inner.m1();
        Inner.m2();
    }*/

    static class Inner{
        /*public static void main(String[] args) {
            Inner inner = new Inner();
            inner.m1();
            Inner.m2();

            Outer o = new Outer();
            o.m1();
            Outer.m2();

        }*/
        public void m1(){
            System.out.println("Inner Class Instance Method ");
        }
        public  static void m2(){
            System.out.println("Inner Class Static Method");
        }
    }




}