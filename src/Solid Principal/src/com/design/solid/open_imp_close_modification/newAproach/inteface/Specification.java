package com.design.solid.open_imp_close_modification.newAproach.inteface;

public interface Specification<T>{
    boolean isSatisfied(T items);
}