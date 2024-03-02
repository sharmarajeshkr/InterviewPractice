package com.design.solid.single_responsibility_principal;

import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private final List<String> entries = new ArrayList<>();
    private int count;

    public void addProduct(String prodName){
        entries.add(""+count++ +" : "+prodName);
    }

    public void removeProduct(int index){
        entries.remove(index);
    }

    // here we break SRP
    // Below methods must be defined in the seprate file like Persistence File.
    public void save(String filename) throws Exception {
        try (PrintStream out = new PrintStream(filename))
        {
            out.println(toString());
        }
    }

    public void load(String filename) {}
    public void load(URL url) {}


    @Override
    public String toString() {
        return  String.join(System.lineSeparator(), entries) ;
    }
}


