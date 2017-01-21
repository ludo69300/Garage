package com.garage.vehicule.option;

import java.io.Serializable;

public class GPS implements Serializable, Option {
	protected double prix=113.5;
	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return this.prix;
	}
	public String toString() {
		return "GPS (" + this.getPrix() + "€)";
	}
}