package com.uvsq.colinebintou.ecommerce.service;

import java.util.ArrayList;

import com.uvsq.colinebintou.ecommerce.dao.AdministrateurDAO;
import com.uvsq.colinebintou.ecommerce.modele.Administrateur;

public class ServiceLoginAdminImpl implements ServiceLoginAdmin {
	public AdministrateurDAO dao;
	
	public AdministrateurDAO getDao() {
		return dao;
	}

	public void setDao(AdministrateurDAO dao) {
		this.dao = dao;
	}

	public Administrateur creerAdmin(Administrateur a) {
		return dao.create(a);
	}

	public Administrateur isValid(String login, String password) {
		return dao.findbyLoginPassword(login, password);
	}

	public Administrateur changePassword(Administrateur c, String newPass) {
		Administrateur anew = c;
		anew.setPassword(newPass);
		return dao.update(anew);
	}

	public ArrayList<Administrateur> findAllAdmins() {
		return dao.findAll();
	}

}
