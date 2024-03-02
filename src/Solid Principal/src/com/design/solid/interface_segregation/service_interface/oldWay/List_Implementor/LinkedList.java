package com.design.solid.interface_segregation.service_interface.oldWay.List_Implementor;

import com.design.solid.interface_segregation.service_interface.oldWay.List;

public class LinkedList implements List<Integer> {
    @Override
    public Integer get() {
        return null;
    }

    @Override
    public void add(Integer integer) {

    }

    @Override
    public Integer poll() {
        return null;
    }

    @Override
    public Integer peek() {
        return null;
    }
}
