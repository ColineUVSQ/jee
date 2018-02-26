package com.uvsq.colinebintou.ecommerce.service;

import java.util.ArrayList;

import com.uvsq.colinebintou.ecommerce.dao.ClientDAO;
import com.uvsq.colinebintou.ecommerce.modele.Client;

public class ServiceLoginClientImpl implements ServiceLoginClient{
	ClientDAO clientDAO;
	
	public ClientDAO getClientDAO() {
		return clientDAO;
	}

	public void setClientDAO(ClientDAO clientDAO) {
		this.clientDAO = clientDAO;
	}

	public Client creerClient(Client c) {
		return clientDAO.create(c);
	}

	public Client isValid(String login, String password) {
		return clientDAO.findbyLoginPassword(login, password);
	}

	public Client changePassword(Client c, String newPass) {
		Client cnew = c;
		cnew.setPassword(newPass);
		return clientDAO.update(cnew);
	}

	public ArrayList<Client> findAllClients() {
		return clientDAO.findAll();
	}

}
