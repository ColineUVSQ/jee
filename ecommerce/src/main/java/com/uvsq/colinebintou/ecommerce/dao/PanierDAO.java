package com.uvsq.colinebintou.ecommerce.dao;

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

	public Panier update(Panier obj) {
		Panier p = (Panier) getHibernateTemplate().get(Panier.class, obj.getId());
		if (p != null){
			getHibernateTemplate().update(obj);
		}
		return p;
	}

	public void delete(Panier obj) {
		getHibernateTemplate().delete(obj);
	}

}
