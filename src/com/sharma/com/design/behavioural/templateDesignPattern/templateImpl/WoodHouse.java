package com.sharma.com.design.behavioural.templateDesignPattern.templateImpl;

import com.sharma.designPattern.behavioral.templateDesignPattern.template.HouseTemplate;

public class WoodHouse extends HouseTemplate {
    @Override
    public void buildPillers() {
        System.out.println("Wood House Pillers");
    }

    @Override
    public void buildWalls() {
        System.out.println("Wood House Walls");
    }
}
