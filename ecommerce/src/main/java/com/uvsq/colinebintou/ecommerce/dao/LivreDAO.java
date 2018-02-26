package com.uvsq.colinebintou.ecommerce.dao;

import java.util.ArrayList;

import com.uvsq.colinebintou.ecommerce.modele.Livre;

public interface LivreDAO extends DAO<Livre> {
	ArrayList<Livre> findAll(); 
}
