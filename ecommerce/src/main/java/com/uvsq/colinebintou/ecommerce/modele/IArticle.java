package com.uvsq.colinebintou.ecommerce.modele;

public interface IArticle {
	int id = 0; //public static final
	void setId(int id);
	int getId();
	String toString();
	double calculPrix();
}

