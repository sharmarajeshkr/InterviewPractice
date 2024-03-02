package com.design.solid.open_imp_close_modification.oldApproch;

import com.design.solid.open_imp_close_modification.newAproach.model.Color;
import com.design.solid.open_imp_close_modification.newAproach.model.Product;
import com.design.solid.open_imp_close_modification.newAproach.model.Size;

import java.util.List;
import java.util.stream.Stream;

public class FilterProducts {
    // Get List of Product by color
    public Stream<Product> filterByColor (List<Product> products, Color color){
        return products.stream().filter( p -> p.color == color );
    }

    // Get List of Product By Size
    public Stream<Product> filterBySize (List<Product> products, Size size){
        return products.stream().filter( p -> p.size == size);
    }

    // Get List of Product By Size and Color
    public Stream<Product> filterBySizeandColor (List<Product> products, Color color, Size size){
        return products.stream().filter( p -> p.size == size && p.color == color);
    }
}
