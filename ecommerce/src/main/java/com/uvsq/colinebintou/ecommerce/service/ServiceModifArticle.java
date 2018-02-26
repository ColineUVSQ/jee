package com.uvsq.colinebintou.ecommerce.service;

import com.uvsq.colinebintou.ecommerce.modele.Article;

public interface ServiceModifArticle {
	Article modifArticle(Article a, String newName);
	Article modifArticle(Article a, double newPrix);
	Article modifArticle(Article a, int newQuantite);
	
}
