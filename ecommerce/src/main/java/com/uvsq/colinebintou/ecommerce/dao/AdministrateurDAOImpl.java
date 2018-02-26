package com.uvsq.colinebintou.ecommerce.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.uvsq.colinebintou.ecommerce.modele.Administrateur;

public class AdministrateurDAOImpl extends HibernateDaoSupport implements AdministrateurDAO{

	public Administrateur create(Administrateur obj) {
		int id = (Integer) getHibernateTemplate().save(obj);
		if (id != 0) {
			return obj;
		}
		else {
			return null;
		}
	}

	public Administrateur findbyId(int id) {
		Administrateur d = (Administrateur) getHibernateTemplate().get(Administrateur.class, id);
		return d;
	}

	public Administrateur update(Administrateur obj) {
		getHibernateTemplate().update(obj);
		return obj;
	}

	public void delete(Administrateur obj) {
		getHibernateTemplate().delete(obj);
	}

	public Administrateur findbyLoginPassword(String login, String password) {
		List<Administrateur> admins = getHibernateTemplate().find("from Administrateur where login=? and password=?", login, password);
		if (admins.size() != 0) {
			return admins.get(0);
		}
		else{
			return null;
		}
	}

	public ArrayList<Administrateur> findAll() {
		return (ArrayList) getHibernateTemplate().find("from Administrateur");
		
	}

}
