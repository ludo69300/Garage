package com.garage;

import java.util.LinkedList;
import java.util.List;

import com.garage.vehicule.Vehicule;

public class Garage {

  protected List<Vehicule> voiture;
    
    public Garage (){
    	List voiture = new LinkedList();
    }

  public String toString() {
  return "*************************\n" +
  		 "* Garage OpenClassrooms *\n" +
  		 "*************************" + 
  		voiture;
  }

  public void addVoiture(Vehicule voit) {
	  voiture.add(voit);
  }
  

}