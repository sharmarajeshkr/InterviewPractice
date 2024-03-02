package com.design.solid.interface_segregation.service_interface.oldWay;

public interface List<T> {
    public T get();
    public void add(T t);
    public T poll();
    public T peek();
}
