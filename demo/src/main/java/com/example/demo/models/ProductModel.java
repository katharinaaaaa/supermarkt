package com.example.demo.models;

import com.example.demo.entities.Product;
import com.example.demo.fachwerte.Geldbetrag;

import java.util.ArrayList;
import java.util.List;

public class ProductModel {

    private List<Product> products;
    

    public ProductModel() {
        this.products = new ArrayList<Product>();
        this.products.add(new Product("p01", "Mellita Kaffee Crema", "kaffee.jpg", new Geldbetrag(250)));
        this.products.add(new Product("p02", "Haltbare Milch", "milch.jpg", new Geldbetrag(210)));
        this.products.add(new Product("p03", "Fein Zucker", "zucker.jpg", new Geldbetrag(220)));
        this.products.add(new Product("p03", "Fein Zucker", "zucker.jpg", new Geldbetrag(220)));
        this.products.add(new Product("p05", "Fein Zucker", "zucker.jpg", new Geldbetrag(220)));
        this.products.add(new Product("p03", "Fein Zucker", "zucker.jpg", new Geldbetrag(220)));
    }

    public List<Product> findAll() {
        return this.products;
    }

    public Product find(String id) {
        for (Product product : this.products) {
            if (product.getId().equalsIgnoreCase(id)) {
                return product;
            }
        }
        return null;
    }
}
