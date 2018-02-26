package com.uvsq.colinebintou.ecommerce.dao;

import java.util.ArrayList;

import com.uvsq.colinebintou.ecommerce.modele.Client;

public interface ClientDAO extends DAO<Client> {
	Client findbyLoginPassword(String login, String password);
	ArrayList<Client> findAll();
}
