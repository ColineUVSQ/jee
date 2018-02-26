package com.uvsq.colinebintou.ecommerce.service;

import com.uvsq.colinebintou.ecommerce.modele.Livre;

public interface ServiceGestionLivre {
	Livre ajoutLivre(Livre l);
	void suppLivre(Livre l);
}
