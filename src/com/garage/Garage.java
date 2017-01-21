package com.garage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.garage.vehicule.Vehicule;

public class Garage implements Serializable {

  protected List<Vehicule> voitures = new ArrayList<Vehicule> ();
    

  public String toString() {
	  String listeVoitures = "";
	  String garageVide = "";
	  for(Vehicule v : voitures)
		  listeVoitures=listeVoitures + v.toString() +"\n";
	  if (listeVoitures=="") {
		  garageVide="Aucune voiture sauvegardée !\n";
		  
	  }
	  

  return garageVide +	
		  "*************************\n" +
  		 "* Garage OpenClassrooms *\n" +
  		 "*************************\n" +
  		listeVoitures;
  		
    }

  public void addVoiture(Vehicule voit) {
	  this.voitures.add(voit);
  }
  

}