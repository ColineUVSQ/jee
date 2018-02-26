package com.uvsq.colinebintou.ecommerce.service;

import java.util.ArrayList;

import com.uvsq.colinebintou.ecommerce.dao.ArticleDAO;
import com.uvsq.colinebintou.ecommerce.modele.Article;

public class ServiceRechercheArticleImpl implements ServiceRechercheArticle {
	ArticleDAO artDao;
	
	public ArticleDAO getArtDao() {
		return artDao;
	}

	public void setArtDao(ArticleDAO dao) {
		this.artDao = dao;
	}

	public Article findByName(String name) {
		return artDao.findByName(name);
	}

	public ArrayList<Article> findAllDispo() {
		return artDao.findAllDispo();
	}

}
