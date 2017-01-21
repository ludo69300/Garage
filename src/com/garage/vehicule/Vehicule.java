package com.garage.vehicule;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.garage.vehicule.moteur.*;
import com.garage.vehicule.option.*;

public class Vehicule implements Serializable{

  protected Double prix;
  protected String nom;
  protected List<Option>options = new ArrayList<Option>();
  protected Marque nomMarquage;
  protected Moteur MonMoteur;
 
 public Vehicule(){

	 
 }

 public String toString() {
	
	 return"+ " + this.nomMarquage +
	" : "+ this.nom +
	" " + this.MonMoteur + this.getOptions() +
	"d'une valeur totale de " + this.prix + "€"
	; 		  
	  }

  public void addOption(Option opt) {
	    this.options.add(opt);
	    this.prix=this.prix+opt.getPrix();
  }

  public Marque getMarque() {
  return this.nomMarquage;
  }

  public List<Option> getOptions() {
  return this.options;
  }

  public Double getPrix() {
  return this.prix;
  }
  public void setMoteur(Moteur MonMoteur){
	 this.MonMoteur=MonMoteur;
	 this.prix=MonMoteur.getPrix();
	  
  }
}