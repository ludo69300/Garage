package com.garage.vehicule.option;

public class Climatisation implements Option{
	protected double prix=347.3;
	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return this.prix;
	}
	public String toString() {
		return "Climatisation (" + this.getPrix() + "€) ";
	}
}