package com.design.solid.open_imp_close_modification.newAproach.inteface;

import java.util.List;
import java.util.stream.Stream;

public interface Filters<T>{
        Stream<T> filters (List<T> items, Specification<T> specification);
}