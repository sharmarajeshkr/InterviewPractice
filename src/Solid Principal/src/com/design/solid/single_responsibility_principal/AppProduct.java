package com.design.solid.single_responsibility_principal;

public class AppProduct {
    public static void main(String[] args) {
        Product p = new Product();
        p.addProduct("Apple");
        p.addProduct("Grapes");
        p.addProduct("Orange");
        p.addProduct("Mango");
        p.addProduct("Pine-Apple");

        System.out.println(p);
        System.out.println("Remove Product from Entrties \n");
        p.removeProduct(3);
        System.out.println(p);



    }
}
