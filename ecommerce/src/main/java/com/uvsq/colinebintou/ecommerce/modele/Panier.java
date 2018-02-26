package com.uvsq.colinebintou.ecommerce.modele;

import java.util.HashSet;
import java.util.Set;

public class Panier implements IPanier {
	private int id;
	private Set<IArticle>  articles;
	private boolean paye;
	private Client client;
	
	public Panier() {
		articles = new HashSet<IArticle>();
		paye = false;
	}
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Set<IArticle> getArticles() {
		return articles;
	}

	public void setArticles(Set<IArticle> articles) {
		this.articles = articles;
	}

	public boolean isPaye() {
		return paye;
	}
	
	public void setPaye(boolean paye) {
		this.paye = paye;
	}
	
	public boolean ajouter(Article a) {
		if (articles.add(a)) return true;
		else return false;
	}
	
	public boolean supprimer(Article a) {
		if (articles.remove(a)) return true;
		else return false;
	}
	
	public double calculPrix() {
		double prixTotal = 0.0;
		for (IArticle a : articles) {
			prixTotal += a.calculPrix();
		}
		return prixTotal;
	}
	
	public String affiche() {
		String chaine = "";
		int i = 1;
		for (IArticle a : articles) {
			chaine += "article numero "+ i + ": " + a.toString();
			chaine += "\n";
			i++;
		}
		return chaine;
	}
	
}
