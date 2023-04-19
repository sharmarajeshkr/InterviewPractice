package com.sharma.com.design.factoryPattern;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram,String hdd, String cpu){
        if (type.equalsIgnoreCase("PC"))
           return new PersonalComputer(ram,hdd,cpu);
        return new Server(ram,hdd,cpu);
    }
}
