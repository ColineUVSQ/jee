package com.uvsq.colinebintou.ecommerce.modele;

import com.uvsq.colinebintou.ecommerce.modele.Article;
import com.uvsq.colinebintou.ecommerce.modele.IArticle;

public class DVD extends Article implements IArticle {
	private String realisateur;
	
	public DVD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getRealisateur() {
		return realisateur;
	}
	
	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}

	public int getId() {
		return super.getId();
	}
	
	public void setId(int id) {
		super.setId(id);
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + getRealisateur();
	}
	
	@Override
	public double calculPrix() {
		return super.getPrix();
	}

}
