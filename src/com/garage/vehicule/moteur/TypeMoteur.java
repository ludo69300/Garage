package com.garage.vehicule.moteur;

public enum TypeMoteur {

  DIESEL("Moteur DIESEL"),
  ESSENCE("Moteur ESSENCE"),
  HYBRIDE("Moteur HYBRIDE"),
  ELECTRIQUE("Moteur ELECTRIQUE");

	 protected String type="";

	  
	  private TypeMoteur(String type) {
		  this.type = type;
	  }
	  
	  public String toString(){
		    return type;
		  }

}