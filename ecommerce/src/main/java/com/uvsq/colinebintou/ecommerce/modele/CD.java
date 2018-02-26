package com.uvsq.colinebintou.ecommerce.modele;

import com.uvsq.colinebintou.ecommerce.modele.Article;
import com.uvsq.colinebintou.ecommerce.modele.IArticle;

public class CD extends Article implements IArticle {
	private String artiste;
	
	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getArtiste() {
		return artiste;
	}
	
	public void setArtiste(String artiste) {
		this.artiste = artiste;
	}

	public int getId() {
		return super.getId();
	}
	
	public void setId(int id) {
		super.setId(id);
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + getArtiste();
	}
	
	@Override
	public double calculPrix() {
		return super.getPrix();
	}

}
