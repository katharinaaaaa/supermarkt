package com.example.demo.entities;

public class Lager {
	
	private String lagerBezeichnung;
	private int kapazitaet;
	
	public Lager() {
		lagerBezeichnung = "";
		kapazitaet = 0;
	}

	public String getLagerBezeichnung() {
		return lagerBezeichnung;
	}

	public void setLagerBezeichnung(String lagerBezeichnung) {
		this.lagerBezeichnung = lagerBezeichnung;
	}

	public int getKapazitaet() {
		return kapazitaet;
	}

	public void setKapazitaet(int kapazitaet) {
		this.kapazitaet = kapazitaet;
	}

}
