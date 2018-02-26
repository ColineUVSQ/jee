package com.uvsq.colinebintou.ecommerce.dao;

import java.util.ArrayList;

import com.uvsq.colinebintou.ecommerce.modele.Administrateur;

public interface AdministrateurDAO extends DAO<Administrateur> {
	Administrateur findbyLoginPassword(String login, String password);
	ArrayList<Administrateur> findAll();
}
