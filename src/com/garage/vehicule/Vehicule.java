package com.garage.vehicule;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import com.garage.vehicule.moteur.*;
import com.garage.vehicule.option.*;

public class Vehicule {

  protected Double prix;
  protected String nom;
  protected List<Option> option;
  protected Marque nomMarquage;
  protected Moteur MonMoteur;
 
 public Vehicule(){
	 List option = new LinkedList();
	 
 }

 public String toString() {
	String options = null;
	options= "+ " + this.nomMarquage;
	options= " : "+ this.nom;
	options= " " + this.MonMoteur; 
	for(int i = 0; i < option.size(); i++){
		options= options+option.get(i);
	}	
	  return options;		  
	  }

  public void addOption(Option opt) {
	    option.add(opt);
  }

  public Marque getMarque() {
  return this.nomMarquage;
  }

  private List<Option> getOptions() {
  return this.option;
  }

  public Double getPrix() {
  return this.prix;
  }
  public void setMoteur(Moteur MonMoteur){
	 this.MonMoteur=MonMoteur;
	  
  }
}