package com.uvsq.colinebintou.ecommerce.service;

import com.uvsq.colinebintou.ecommerce.dao.DvdDAO;
import com.uvsq.colinebintou.ecommerce.modele.DVD;

public class ServiceGestionDVDImpl implements ServiceGestionDVD {
	private DvdDAO dao;
	
	public DvdDAO getDao() {
		return dao;
	}

	public void setDao(DvdDAO dao) {
		this.dao = dao;
	}

	public DVD ajoutDVD(DVD d) {
		return dao.create(d);
	}

	public void suppDVD(DVD d) {
		dao.delete(d);
	}

}
