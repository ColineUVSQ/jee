package com.uvsq.colinebintou.ecommerce.modele;


public class Livre extends Article implements IArticle {

	private String auteur;
	
	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return super.toString() + " " + getAuteur();
	}
	
	@Override
	public double calculPrix() {
		return super.getPrix();
	}

	public void setId(int id) {
		super.setId(id);
	}
	
	public int getId() {
		return super.getId();
	}

}
