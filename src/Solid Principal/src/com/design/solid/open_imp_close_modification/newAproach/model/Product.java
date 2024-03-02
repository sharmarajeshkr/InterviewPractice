package com.design.solid.open_imp_close_modification.newAproach.model;

public class Product {
    public String name;
    public Color color;
    public Size size;

    Product(){}

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }
}
