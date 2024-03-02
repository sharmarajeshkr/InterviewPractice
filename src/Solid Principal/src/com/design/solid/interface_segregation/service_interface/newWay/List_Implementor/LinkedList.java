package com.design.solid.interface_segregation.service_interface.newWay.List_Implementor;


import com.design.solid.interface_segregation.service_interface.newWay.service_interface.Deque;
import com.design.solid.interface_segregation.service_interface.newWay.service_interface.List;

public class LinkedList implements List<Integer>, Deque<Integer> {
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
