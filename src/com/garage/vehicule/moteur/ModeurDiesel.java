package com.garage.vehicule.moteur;

public class ModeurDiesel extends Moteur {
	public ModeurDiesel(String cylindre, Double prix){
		super(cylindre, prix);
		this.type=TypeMoteur.DIESEL;
	}
}