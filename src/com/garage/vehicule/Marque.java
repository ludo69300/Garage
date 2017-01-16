package com.garage.vehicule;

enum Marque {

  RENO("Voiture RENO"),
  PIEGEOT("Voiture PIEGEOT"),
  TROEN("Voiture TROEN");
 protected String marque="";

  
  private Marque(String marque) {
	  this.marque = marque;
  }
  public String toString(){
	    return marque;
	  }
  
}