package com.garage.vehicule.option;

import java.io.Serializable;

public class Climatisation implements Serializable, Option{
	protected double prix=347.3;
	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return this.prix;
	}
	public String toString() {
		return "Climatisation (" + this.getPrix() + "€)";
	}
}