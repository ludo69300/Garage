package com.garage.vehicule.moteur;

public class MoteurElectrique extends Moteur {
	public MoteurElectrique(String cylindre, Double prix){
		super(cylindre, prix);
		this.type=TypeMoteur.ELECTRIQUE;
	}
}