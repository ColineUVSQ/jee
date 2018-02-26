package com.uvsq.colinebintou.ecommerce.service;

import java.util.ArrayList;

import com.uvsq.colinebintou.ecommerce.modele.Article;

public interface ServiceRechercheArticle {
	Article findByName(String name);
	ArrayList<Article> findAllDispo();
}
