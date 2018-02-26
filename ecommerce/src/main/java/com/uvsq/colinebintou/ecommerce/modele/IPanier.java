package com.uvsq.colinebintou.ecommerce.modele;

public interface IPanier {
	int id=0;
	void setId(int id);
	int getId();
	double calculPrix();
	String affiche();
}
