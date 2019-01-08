package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

public class Sortiment {

	private String sortiment_id;
//	private String warengruppenTyp;
	private List<Product> warenSortiment;

	public Sortiment() {

		sortiment_id = "0";
		// warengruppenTyp = "";
		warenSortiment = new ArrayList<Product>();

	}

	public Sortiment(String id, Product produkt) {

		sortiment_id = id;
		// warengruppenTyp = "";
		warenSortiment = new ArrayList<Product>();
		warenSortiment.add(produkt);

	}

	public void addProduct(Product produkt) {
		this.warenSortiment.add(produkt);
	}

	public Product getProduct(String id) {
		int convInt = Integer.parseInt(id);
		return this.warenSortiment.get(convInt);

	}

}
