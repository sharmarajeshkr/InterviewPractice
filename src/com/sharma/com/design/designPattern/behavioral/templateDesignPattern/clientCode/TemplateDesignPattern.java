package com.sharma.com.design.designPattern.behavioral.templateDesignPattern.clientCode;
/*
    Template method defines the steps to execute an algorithm and
    it can provide default implementation that might be common for all or some of the subclasses.

    Example : Suppose we want to provide an algorithm to build a house.
        1. The steps need to be performed to build a house are
            – building foundation, building pillars, building walls and windows.
        The important point is that the we can’t change the order of execution because
        we can’t build windows before building the foundation.
        So in this case we can create a template method that will use different methods to build the house.

    Now building the foundation for a house is same for all type of houses, whether its a wooden house or a glass house.
    So we can provide base implementation for this, if subclasses want to override this method,
    they can but mostly it’s common for all the types of houses.

    Note : To make sure that subclasses don’t override the template method, we should make it final.
    Used In jdk : Input/Output Stream , Reader and Writer
    In collection : Abstract List/Set/Map
*/

import com.sharma.com.design.designPattern.behavioral.templateDesignPattern.template.HouseTemplate;
import com.sharma.com.design.designPattern.behavioral.templateDesignPattern.templateImpl.GlassHouse;
import com.sharma.com.design.designPattern.behavioral.templateDesignPattern.templateImpl.WoodHouse;

public class TemplateDesignPattern {
    public static void main(String[] args) {
        HouseTemplate houseType = new WoodHouse();
        // Using Template Method
        houseType.buildHouse();

        System.out.println("*****************************");

        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}

