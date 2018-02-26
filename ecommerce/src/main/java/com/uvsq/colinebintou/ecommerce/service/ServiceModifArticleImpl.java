package com.uvsq.colinebintou.ecommerce.service;

import com.uvsq.colinebintou.ecommerce.dao.ArticleDAO;

import com.uvsq.colinebintou.ecommerce.modele.Article;


public class ServiceModifArticleImpl implements ServiceModifArticle{
	private ArticleDAO artDao;
	
	public ArticleDAO getArtDao() {
		return artDao;
	}

	public void setArtDao(ArticleDAO artDao) {
		this.artDao = artDao;
	}
	
	public Article modifArticle(Article a, String newName) {
		Article anew = a;
		anew.setNom(newName);
		return artDao.update(anew);
	}

	public Article modifArticle(Article a, double newPrix) {
		Article anew = a;
		anew.setPrix(newPrix);
		return artDao.update(anew);
	}

	public Article modifArticle(Article a, int newQuantite) {
		Article anew = a;
		anew.setQuantite(newQuantite);
		return artDao.update(anew);
	}

}
