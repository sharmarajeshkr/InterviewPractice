package com.sharma.designPattern.structural.Adapter;


/*
    One of the great real life example of Adapter design pattern is mobile charger.
    Mobile battery needs 3 volts to charge but the normal socket produces either 120V (US) or 240V (India).
    So the mobile charger works as an adapter between mobile charging socket and the wall socket.

    So first of all we will have two classes – Volt (to measure volts) and Socket (producing constant volts of 120V).
 */


public class AdapterClientCode {
    public static void main(String[] args) {
        // Using Class Adapter
        AdapterDesignPattern adapterDesignPattern = new AdapterDesignPattern();
        adapterDesignPattern.testClassAdapter();
        // Using Object Adapter
        adapterDesignPattern.testObjectAdapter();
    }


}
