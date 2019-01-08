package com.example.demo.entities;

import com.example.demo.fachwerte.Geldbetrag;

public class Product {

    private String id;
    private String name;
    private String photo;
    private Geldbetrag price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Geldbetrag getPrice() {
        return price;
    }

    public void setPrice(Geldbetrag price) {
        this.price = price;
    }

    public Product() {
    }

    public Product(String id, String name, String photo, Geldbetrag price) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.price = price;
    }

}