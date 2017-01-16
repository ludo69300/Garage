package com.garage.vehicule.option;

public class SiegeChauffant implements Option{
	protected double prix=562.9;
	
	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return this.prix;
	}
	public String toString() {
		return "Siège chauffant" + this.getPrix() + "€) ";
	}
	
	
}