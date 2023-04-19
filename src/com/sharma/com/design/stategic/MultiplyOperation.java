package com.sharma.com.design.stategic;

public class MultiplyOperation implements Strategic{
    @Override
    public int doOpration(int i, int j) {
        return i*j;
    }
}
