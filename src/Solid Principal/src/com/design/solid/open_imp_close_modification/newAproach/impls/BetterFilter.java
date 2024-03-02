package com.design.solid.open_imp_close_modification.newAproach.impls;

import com.design.solid.open_imp_close_modification.newAproach.inteface.Filters;
import com.design.solid.open_imp_close_modification.newAproach.inteface.Specification;
import com.design.solid.open_imp_close_modification.newAproach.model.Product;

import java.util.List;
import java.util.stream.Stream;

public class BetterFilter implements Filters<Product> {

    public Stream<Product> filters(List<Product> items, Specification<Product> specification) {
        return items.stream().filter( p -> specification.isSatisfied(p));
    }
}
