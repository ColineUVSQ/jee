package com.uvsq.colinebintou.ecommerce.service;

import java.util.ArrayList;

import com.uvsq.colinebintou.ecommerce.dao.CdDAO;
import com.uvsq.colinebintou.ecommerce.modele.CD;

public class ServiceRechercheCDImpl implements ServiceRechercheCD{
	private CdDAO dao;
	
	public CdDAO getDao() {
		return dao;
	}


	public void setDao(CdDAO dao) {
		this.dao = dao;
	}
	
	public ArrayList<CD> findAllCD() {
		return dao.findAll();
	}

}
