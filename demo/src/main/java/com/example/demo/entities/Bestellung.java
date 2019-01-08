package com.example.demo.entities;

import com.example.demo.fachwerte.Datum;

public class Bestellung {
	
	 private String bestellNummer;
	 private String lieferAdresse;
	 private Datum lieferdatum;
	 
	 public Bestellung(int tag, int monat, int jahr, String bestellNummer, String lieferAdresse) {
		 this.bestellNummer = bestellNummer;
		 this.lieferAdresse = lieferAdresse;
		 lieferdatum = Datum.get(tag, monat, jahr);
	 }

	public String getBestellNummer() {
		return bestellNummer;
	}

	public void setBestellNummer(String bestellNummer) {
		this.bestellNummer = bestellNummer;
	}

	public String getLieferAdresse() {
		return lieferAdresse;
	}

	public void setLieferAdresse(String lieferAdresse) {
		this.lieferAdresse = lieferAdresse;
	}

	public Datum getLieferdatum() {
		return lieferdatum;
	}

	public void setLieferdatum(Datum lieferdatum) {
		this.lieferdatum = lieferdatum;
	}

}
