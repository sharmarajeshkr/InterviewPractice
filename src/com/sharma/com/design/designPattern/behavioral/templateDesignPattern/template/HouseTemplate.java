package com.sharma.com.design.designPattern.behavioral.templateDesignPattern.template;

/*
1. The steps need to be performed to build a house are
        – building foundation, building pillars, building walls and windows.
        The important point is that the we can’t change the order of execution because
        we can’t build windows before building the foundation.
        So in this case we can create a template method that will use different methods to build the house.
*/
public abstract class HouseTemplate {
    public final void buildHouse() {
        //Implementation
        buildFoundation();
        buildPillers();
        buildWalls();
        buildWindows();
    }

    private void buildWindows() {
        System.out.println("Build Windows");
    }

    private void buildFoundation() {
        System.out.println("Build Foundation");
    }

    public abstract void buildPillers();

    public abstract void buildWalls();
}
