package com.sharma.designPattern.structural.Adapter;

/*
    One of the great real life example of Adapter design pattern is mobile charger.
    Mobile battery needs 3 volts to charge but the normal socket produces either 120V (US) or 240V (India).
    So the mobile charger works as an adapter between mobile charging socket and the wall socket.

    So first of all we will have two classes – Volt (to measure volts) and Socket (producing constant volts of 120V).
 */



public class AdapterDesignPattern {
    // Using Class Adapter
    public static void testObjectAdapter(){
        SocketAdapter sockAdapter = new SocketObjectAdapter();
        Volt v3 = getVolt(sockAdapter,3);
        Volt v12 = getVolt(sockAdapter,12);
        Volt v120 = getVolt(sockAdapter,120);
        System.out.println("v3 volts using Class Adapter="+v3.getVolts());
        System.out.println("v12 volts using Class Adapter="+v12.getVolts());
        System.out.println("v120 volts using Class Adapter="+v120.getVolts());
    }

    // Using Class Adapter
    public static void testClassAdapter(){
        SocketAdapter sockAdapter = new SocketClassAdapterImplementation();
        Volt v3 = getVolt(sockAdapter,3);
        Volt v12 = getVolt(sockAdapter,12);
        Volt v120 = getVolt(sockAdapter,120);
        System.out.println("v3 volts using Class Adapter="+v3.getVolts());
        System.out.println("v12 volts using Class Adapter="+v12.getVolts());
        System.out.println("v120 volts using Class Adapter="+v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter sockAdapter, int i) {
        switch (i){
            case 3: return sockAdapter.get3Volts();
            case 12: return sockAdapter.get12Volts();
            case 120: return sockAdapter.get120Volts();
            default: return sockAdapter.get120Volts();
        }
    }
}

    // Step 1. Create Volt and Socket class
class Volt {
    private int volts;

    public Volt(int volts){
        this.volts = volts;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }
}

class Socket{
    public Volt getVolt(){
        return new Volt(120);
    }
}

// Step 2 : Create SocketAdapter the produces 120V,12V and 3V

interface  SocketAdapter{
    public Volt get120Volts();
    public Volt get12Volts();
    public Volt get3Volts();
}

/* Step 3 : 2 Ways to Implement Adapter Design Pattern
        1 . Class Adapter // By Using extends and implements SocketAdapter
        2 . Object Adapter // By Using Composition Has-A relationship
 */

//Using Class Adapter
class SocketClassAdapterImplementation extends Socket implements SocketAdapter {

    // Convert Volts : into Lower volt
    // Accept : Volt and int
    // return : Volt
    private Volt convertVolts(Volt volt,int i){
        return new Volt(volt.getVolts()/i);
    }

    @Override
    public Volt get120Volts() {
        return getVolt();
    }

    @Override
    public Volt get12Volts() {
        Volt v = getVolt();
        return convertVolts(v,10);
    }

    @Override
    public Volt get3Volts() {
        Volt v = getVolt();
        return convertVolts(v,40);
    }
}

// Using Object Adapter
class SocketObjectAdapter implements SocketAdapter{

    Socket socket = new Socket();

    // Convert Volts : into Lower volt
    // Accept : Volt and int
    // return : Volt
    private Volt convertVolts(Volt volt,int i){
        return new Volt(volt.getVolts()/i);
    }


    @Override
    public Volt get120Volts() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volts() {
        Volt v = socket.getVolt();
        return convertVolts(v,10);
    }

    @Override
    public Volt get3Volts() {
        Volt v = socket.getVolt();
        return convertVolts(v,40);
    }
}


















