package com.uvsq.colinebintou.ecommerce.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.uvsq.colinebintou.ecommerce.modele.Client;

public class ClientDAOImpl extends HibernateDaoSupport implements ClientDAO {

	public Client create(Client obj) {
		int id = (Integer) getHibernateTemplate().save(obj);
		if (id != 0) {
			return obj;
		}
		else {
			return null;
		}
	}

	public Client findbyId(int id) {
		Client c = (Client) getHibernateTemplate().get(Client.class, id);
		return c;
	}
	
	public Client findbyLoginPassword(String login, String password) {
		List<Client> clients = getHibernateTemplate().find("from Client where login=? and password=?", login, password);
		if (clients.size() != 0) {
			return clients.get(0);
		}
		else{
			return null;
		}
	}
	
	public Client update(Client obj) {
		getHibernateTemplate().update(obj);
		return obj;
	}

	public void delete(Client obj) {
		getHibernateTemplate().delete(obj);
	}

	public ArrayList<Client> findAll() {
		return (ArrayList) getHibernateTemplate().find("from Client");
	}

}
