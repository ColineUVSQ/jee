package com.uvsq.colinebintou.ecommerce.service;

import com.uvsq.colinebintou.ecommerce.modele.Article;
import com.uvsq.colinebintou.ecommerce.modele.Panier;

public interface ServicePanier {
	Panier creerPanier(Panier p);
	void suppPanier(Panier p);
	Panier ajoutPanier(Article a, Panier p);
	void suppPanier(Article a, Panier p);
	void validerPanier(Panier p);
}
