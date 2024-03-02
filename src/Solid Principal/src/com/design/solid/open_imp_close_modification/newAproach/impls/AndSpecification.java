package com.design.solid.open_imp_close_modification.newAproach.impls;

import com.design.solid.open_imp_close_modification.newAproach.inteface.Specification;

public class AndSpecification<T> implements Specification<T> {
    private Specification<T> firstFilter, secondFilter;

    public AndSpecification(Specification<T> firstFilter,Specification<T> secondFilter){
        this.firstFilter = firstFilter;
        this.secondFilter = secondFilter;
    }

    @Override
    public boolean isSatisfied(T items) {
        return firstFilter.isSatisfied(items) && secondFilter.isSatisfied(items);
    }
}
