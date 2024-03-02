package com.sharma.designPattern.structural.Flyweight;

import java.util.HashMap;

public class BirdFactory {
    private static final HashMap angrybirdMap = new HashMap();

    public static Bird getAngryBird(String color) {
        AngryBird angrybird = (AngryBird)angrybirdMap.get(color);

        if(angrybird == null) {
            angrybird = new AngryBird(color);
            angrybirdMap.put(color, angrybird);
            System.out.println("Creating Angry Bird of color : " + color);
        }
        return angrybird;
    }
}
