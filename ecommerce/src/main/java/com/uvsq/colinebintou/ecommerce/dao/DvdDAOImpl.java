package com.uvsq.colinebintou.ecommerce.dao;

import java.util.ArrayList;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.uvsq.colinebintou.ecommerce.modele.DVD;

public class DvdDAOImpl extends HibernateDaoSupport implements DvdDAO {

	public DVD create(DVD obj) {
		int id = (Integer) getHibernateTemplate().save(obj);
		if (id != 0) {
			return obj;
		}
		else {
			return null;
		}
	}

	public DVD findbyId(int id) {
		DVD d = (DVD) getHibernateTemplate().get(DVD.class, id);
		return d;
	}

	public DVD update(DVD obj) {
		getHibernateTemplate().update(obj);
		return obj;
		
	}

	public void delete(DVD obj) {
		getHibernateTemplate().delete(obj);
	}

	public ArrayList<DVD> findAll() {
		return (ArrayList<DVD>) getHibernateTemplate().find("from Article where type_article=?","DVD");
	}

}
