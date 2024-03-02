package com.design.solid.open_imp_close_modification.newAproach.impls;


import com.design.solid.open_imp_close_modification.newAproach.inteface.Specification;
import com.design.solid.open_imp_close_modification.newAproach.model.Product;
import com.design.solid.open_imp_close_modification.newAproach.model.Size;

public class SizeSpecification implements Specification<Product> {
    private Size size;
    public SizeSpecification(Size size){
        this.size = size;
    }

    public boolean isSatisfied(Product items) {
        return items.size == size;
    }
}

