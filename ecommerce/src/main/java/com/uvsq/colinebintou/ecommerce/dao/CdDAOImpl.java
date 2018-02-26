package com.uvsq.colinebintou.ecommerce.dao;

import java.util.ArrayList;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.uvsq.colinebintou.ecommerce.modele.CD;

public class CdDAOImpl extends HibernateDaoSupport implements CdDAO {

	public CD create(CD obj) {
		int id = (Integer) getHibernateTemplate().save(obj);
		if (id != 0) {
			return obj;
		}
		else {
			return null;
		}
	}

	public CD findbyId(int id) {
		CD c = (CD) getHibernateTemplate().get(CD.class, id);
		return c;
	}

	public CD update(CD obj) {
		getHibernateTemplate().update(obj);
		return obj;
	}

	public void delete(CD obj) {
		getHibernateTemplate().delete(obj);
	}

	public ArrayList<CD> findAll() {
		return (ArrayList<CD>) getHibernateTemplate().find("from Article where type_article=?","CD");

	}

}
