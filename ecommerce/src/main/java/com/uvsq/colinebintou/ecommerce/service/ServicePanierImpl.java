package com.uvsq.colinebintou.ecommerce.service;

import com.uvsq.colinebintou.ecommerce.dao.PanierDAO;
import com.uvsq.colinebintou.ecommerce.modele.Article;
import com.uvsq.colinebintou.ecommerce.modele.Panier;

public class ServicePanierImpl implements ServicePanier{
	private PanierDAO dao;

	public PanierDAO getDao() {
		return dao;
	}

	public void setDao(PanierDAO dao) {
		this.dao = dao;
	}

	public Panier ajoutPanier(Article a, Panier p) {
		p.ajouter(a);
		dao.update(p);
		return p;
	}

	public void suppPanier(Article a, Panier p) {
		p.supprimer(a);
		dao.update(p);
	}

	public void validerPanier(Panier p) {
		p.setPaye(true);
		dao.update(p);
	}

	public Panier creerPanier(Panier p) {
		return dao.create(p);
	}

	public void suppPanier(Panier p) {
		dao.delete(p);
	}
	
}
