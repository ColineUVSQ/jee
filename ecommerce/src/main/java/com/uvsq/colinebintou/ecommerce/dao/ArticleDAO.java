package com.uvsq.colinebintou.ecommerce.dao;

import java.util.ArrayList;

import com.uvsq.colinebintou.ecommerce.modele.Article;

public interface ArticleDAO extends DAO<Article>{
	Article findByName(String name);
	ArrayList<Article> findAllDispo();
}
