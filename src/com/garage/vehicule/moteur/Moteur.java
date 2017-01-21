package com.garage.vehicule.moteur;

import java.io.Serializable;

public class Moteur implements Serializable{

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

public Double getPrix() {
  return prix;
  }
  
public String getCylindre() {
  return cylindre;
  }
  
public TypeMoteur getType() {
	  return type;
	  }

}