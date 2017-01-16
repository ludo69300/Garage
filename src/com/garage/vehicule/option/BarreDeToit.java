package com.garage.vehicule.option;

public class BarreDeToit implements Option{
	protected double prix=29.9;
	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return this.prix;
	}
	public String toString() {
		return "Barre de toit (" + this.getPrix() + "€) ";
	}
}