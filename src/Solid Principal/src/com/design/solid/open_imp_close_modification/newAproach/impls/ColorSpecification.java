package com.design.solid.open_imp_close_modification.newAproach.impls;


import com.design.solid.open_imp_close_modification.newAproach.model.Color;
import com.design.solid.open_imp_close_modification.newAproach.model.Product;
import com.design.solid.open_imp_close_modification.newAproach.inteface.Specification;

public class ColorSpecification implements Specification<Product> {
    private Color color;
    public ColorSpecification(Color color){
        this.color = color;
    }
    public boolean isSatisfied(Product item) {
        return item.color == color;
    }
}