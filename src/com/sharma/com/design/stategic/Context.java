package com.sharma.com.design.stategic;

public class Context {
    public Strategic strategic;

    public Context(Strategic strategic) {
        this.strategic = strategic;
    }

    public int executeStrategic(int num1, int num2) {
        return strategic.doOpration(num1, num2);
    }
}
