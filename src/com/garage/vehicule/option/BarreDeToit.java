package com.garage.vehicule.option;

import java.io.Serializable;

public class BarreDeToit implements Serializable, Option{
	protected double prix=29.9;
	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return this.prix;
	}
	public String toString() {
		return "Barre de toit (" + this.getPrix() + "€)";
	}
}