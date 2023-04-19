package com.sharma.com.design.designPattern.creation.builder.app2;

public class App {
    public static void main(String[] args) {
         Computer comp =  new Computer.ComputerBuilder("250 GB","10 GB")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();
        System.out.println(comp);
    }
}
