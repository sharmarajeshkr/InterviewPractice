package com.sharma.com.design.designPattern.structural.Flyweight;

public class AngryBird implements Bird {
    private String color;

    public AngryBird(String color){
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println(" AngryBird Draw () [Color "+color);
    }
}
