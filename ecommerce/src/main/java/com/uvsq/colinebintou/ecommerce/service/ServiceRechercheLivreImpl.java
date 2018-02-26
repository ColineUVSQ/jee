package com.uvsq.colinebintou.ecommerce.service;

import java.util.ArrayList;

import com.uvsq.colinebintou.ecommerce.dao.LivreDAO;
import com.uvsq.colinebintou.ecommerce.modele.Livre;

public class ServiceRechercheLivreImpl implements ServiceRechercheLivre{
	private LivreDAO dao;
	
	public LivreDAO getDao() {
		return dao;
	}

	public void setDao(LivreDAO dao) {
		this.dao = dao;
	}

	public ArrayList<Livre> findAllLivre() {
		return dao.findAll();
	}
}
