package com.design.solid.open_imp_close_modification.oldApproch;

import com.design.solid.open_imp_close_modification.newAproach.model.Color;
import com.design.solid.open_imp_close_modification.newAproach.model.Product;
import com.design.solid.open_imp_close_modification.newAproach.model.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class OpenClosePrincipal {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.RED, Size.SMALL);
        Product grapes = new Product("Grapes", Color.GREEN, Size.LARGE);
        Product mango = new Product("Mango", Color.GREEN, Size.SMALL);

        List<Product> products = new ArrayList<>();
        products.add(apple);products.add(grapes);products.add(mango);

        FilterProducts fp = new FilterProducts();
        Stream<Product> sp =  fp.filterByColor(products,Color.RED);
            sp.forEach(product -> System.out.println( product.name +" is Red"));

        Stream<Product> sp1 =  fp.filterBySizeandColor(products,Color.GREEN,Size.SMALL);
            sp1.forEach(product -> System.out.println( product.name +" is GREEN and Size is Small"));
    }

}
