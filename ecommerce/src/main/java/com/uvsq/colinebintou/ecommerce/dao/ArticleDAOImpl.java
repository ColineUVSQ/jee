package com.uvsq.colinebintou.ecommerce.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.uvsq.colinebintou.ecommerce.modele.Article;

public class ArticleDAOImpl extends HibernateDaoSupport implements ArticleDAO{

	public Article create(Article obj) {
		int id = (Integer) getHibernateTemplate().save(obj);
		if (id != 0) {
			return obj;
		}
		else {
			return null;
		}
	}

	public Article findbyId(int id) {
		Article a = (Article) getHibernateTemplate().get(Article.class, id);
		return a;
	}

	public Article update(Article obj) {
		getHibernateTemplate().update(obj);
		return obj;
	}

	public void delete(Article obj) {
		getHibernateTemplate().delete(obj);
	}

	public Article findByName(String name) {
		List<Article> art = getHibernateTemplate().find("from Article where nom =?", name);
		if(art.size() != 0) {
			return art.get(0);
		}
		else {
			return null;
		}
	}

	public ArrayList<Article> findAllDispo() {
		return (ArrayList<Article>) getHibernateTemplate().find("from Article where quantite > 0");
		
 	}

}
