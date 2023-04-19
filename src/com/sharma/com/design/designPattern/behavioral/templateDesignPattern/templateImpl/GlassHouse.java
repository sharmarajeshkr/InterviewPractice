package com.sharma.com.design.designPattern.behavioral.templateDesignPattern.templateImpl;

import com.sharma.com.design.designPattern.behavioral.templateDesignPattern.template.HouseTemplate;

public class GlassHouse extends HouseTemplate {
    @Override
    public void buildPillers() {
        System.out.println("Glass House Pillers");
    }

    @Override
    public void buildWalls() {
        System.out.println("Glass House Walls");
    }
}
