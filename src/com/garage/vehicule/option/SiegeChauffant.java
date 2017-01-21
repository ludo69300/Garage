package com.garage.vehicule.option;

import java.io.Serializable;

public class SiegeChauffant implements Serializable, Option{
	protected double prix=562.9;
	
	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return this.prix;
	}
	public String toString() {
		return "Siège chauffant (" + this.getPrix() + "€)";
	}
	
	
}