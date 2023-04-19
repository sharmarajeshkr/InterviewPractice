package com.sharma.practice;

interface D {
}


interface A {
    void m1();
}


class B implements A {
    @Override
    public void m1() {
        System.out.println("M1 from Class B");
    }
}

class C {
    public static void main(String[] args) {
       A d = new A() {
           @Override
           public void m1() {

           }
       };
        A a = new B();
        B b = new B();
        // new A(){};


    }

}