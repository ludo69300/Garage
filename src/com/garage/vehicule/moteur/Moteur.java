package com.garage.vehicule.moteur;

public class Moteur {

  protected TypeMoteur type;

  protected String cylindre;

  protected Double prix;


public Moteur(String cylindre, Double prix) {
	  this.cylindre=cylindre;
	  this.prix=prix;
  }

public String toString() {
  return this.getType() + " " + this.getCylindre()+ " ("+ this.getPrix() + "€)";
  }

  private Double getPrix() {
  return prix;
  }
  
  private String getCylindre() {
  return cylindre;
  }
  
  private TypeMoteur getType() {
	  return type;
	  }

}