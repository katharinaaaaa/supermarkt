package com.example.demo.entities;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.fachwerte.Geldbetrag;

public class Bestellposition {

	private int anzahlProdukte;
	private Geldbetrag preis;
	private Geldbetrag summeZuZahlen;
	private List<Product> produkteWarenkorb;
	private List<Integer> anzahlProProdukt;

	public Bestellposition() {
		this.anzahlProdukte = 0;
		this.preis = new Geldbetrag(0);
		this.summeZuZahlen = new Geldbetrag(0);
		this.produkteWarenkorb = new ArrayList<Product>();
		this.anzahlProProdukt = new ArrayList<Integer>();
	}


	public void addiereNeuesProdukt(int anzahl, Product product) {

		
		System.out.println("[addiereNeuesProdukt] \t anzahl " + anzahl  + " produkt" + product.getName());
		
		if (produkteWarenkorb.contains(product)) {
			int index = produkteWarenkorb.indexOf(product);
			int tempAnzahl = anzahlProProdukt.get(index);
			anzahlProProdukt.set(index, tempAnzahl + anzahl);
			System.out.println("[anzahlProProdukt] \t" + anzahlProProdukt.get(index) );
		} else {
			produkteWarenkorb.add(product);
			anzahlProProdukt.add(anzahl);
		}
		
		System.out.println(getAnzahlProdukte());

	}

	public String getSummeString() {

		for (Integer zwischenSumme : anzahlProProdukt) {
			summeZuZahlen.add(Geldbetrag.intconv(zwischenSumme));
		}
		System.out.println(summeZuZahlen);
		return summeZuZahlen.toBetragsstring();
	}

	public int getAnzahlProdukte() {
		
		return anzahlProProdukt.size();

	}

}
