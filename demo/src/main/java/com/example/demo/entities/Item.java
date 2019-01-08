package com.example.demo.entities;

import com.example.demo.fachwerte.Geldbetrag;

public class Item {

    private Product product;
    private Bestellposition bestellposition = new Bestellposition();
    private int quantity;
    private Geldbetrag total = new Geldbetrag(0);

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public Bestellposition getBestellPosition() {
    	return bestellposition;
    }
    
    public void setBestellposition(Bestellposition bestellposition) {
    	this.bestellposition = bestellposition;
    }


    public Geldbetrag getTotal(){return total;}

    public Item() {
    }

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
