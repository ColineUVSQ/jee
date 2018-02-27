package com.uvsq.colinebintou.ecommerce.dao;

import java.util.ArrayList;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.uvsq.colinebintou.ecommerce.modele.Panier;

public class PanierDAO extends HibernateDaoSupport implements DAO<Panier>{

	public Panier create(Panier obj) {
		int id = (Integer) getHibernateTemplate().save(obj);
		if (id != 0) {
			return obj;
		}
		else {
			return null;
		}
	}

	public Panier findbyId(int id) {
		Panier p = (Panier) getHibernateTemplate().get(Panier.class, id);
		return p;
	}

	public Panier findByIdClient(int id) {
		ArrayList<Panier> paniers = (ArrayList<Panier>) getHibernateTemplate().find("from Panier where id_client=? and paye=0",id);
		if(paniers.size()==1) {
			return paniers.get(0);
		}else {
			return null;
		}
	}
	
	public Panier update(Panier obj) {
		getHibernateTemplate().update(obj);
		return obj;
	}

	public void delete(Panier obj) {
		getHibernateTemplate().delete(obj);
	}

}
