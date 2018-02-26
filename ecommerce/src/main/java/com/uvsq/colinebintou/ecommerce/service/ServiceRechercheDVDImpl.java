package com.uvsq.colinebintou.ecommerce.service;

import java.util.ArrayList;

import com.uvsq.colinebintou.ecommerce.dao.DvdDAO;
import com.uvsq.colinebintou.ecommerce.modele.DVD;

public class ServiceRechercheDVDImpl implements ServiceRechercheDVD{
	private DvdDAO dao;
	
	public DvdDAO getDao() {
		return dao;
	}


	public void setDao(DvdDAO dao) {
		this.dao = dao;
	}
	
	public ArrayList<DVD> findAllDVD() {
		return dao.findAll();
	}

}
