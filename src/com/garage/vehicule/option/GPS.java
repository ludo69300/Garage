package com.garage.vehicule.option;

public class GPS implements Option {
	protected double prix=113.5;
	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return this.prix;
	}
	public String toString() {
		return "GPS (" + this.getPrix() + "€) ";
	}
}