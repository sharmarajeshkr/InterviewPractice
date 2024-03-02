package com.design.solid.open_imp_close_modification.newAproach;

import com.design.solid.open_imp_close_modification.newAproach.impls.AndSpecification;
import com.design.solid.open_imp_close_modification.newAproach.impls.BetterFilter;
import com.design.solid.open_imp_close_modification.newAproach.impls.ColorSpecification;
import com.design.solid.open_imp_close_modification.newAproach.impls.SizeSpecification;
import com.design.solid.open_imp_close_modification.newAproach.model.Color;
import com.design.solid.open_imp_close_modification.newAproach.model.Product;
import com.design.solid.open_imp_close_modification.newAproach.model.Size;

import java.util.ArrayList;
import java.util.List;

public class OpenClosePrincipal {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.RED, Size.SMALL);
        Product grapes = new Product("Grapes", Color.GREEN, Size.LARGE);
        Product mango = new Product("Mango", Color.GREEN, Size.SMALL);

        List<Product> products = new ArrayList<>();
        products.add(apple);products.add(grapes);products.add(mango);

        System.out.println("New Changes");
        BetterFilter bf = new BetterFilter();
        // For Color
        bf.filters(products,new ColorSpecification(Color.RED))
                .forEach(product -> System.out.println( product.name +" is Red"));
        // For Size
        bf.filters(products,new SizeSpecification(Size.SMALL))
                .forEach(product -> System.out.println( product.name +" size is small"));

        // Color and Size Filter
        System.out.println("\n \n New using and Specification Color and size filter \n \n ");
        AndSpecification<Product> sa = new AndSpecification<Product>
                 (new ColorSpecification(Color.GREEN),new SizeSpecification(Size.SMALL));
        bf.filters(products,sa)
                .forEach(product -> System.out.println( product.name +" is GREEN and Size is Small"));;

    }

}
