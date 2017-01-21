package com.garage.vehicule.option;

import java.io.Serializable;

public class VitreElectrique implements Serializable, Option{
	protected double prix=212.35;

	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return this.prix;
	}
	public String toString() {
		return "Vitre electrique (" + this.getPrix() + "€)";
	}
}