package com.uvsq.colinebintou.ecommerce.service;

import java.util.ArrayList;

import com.uvsq.colinebintou.ecommerce.modele.Client;

public interface ServiceLoginClient {
	Client creerClient(Client c);
	Client isValid(String login, String password);
	Client changePassword(Client c, String newPass);
	ArrayList<Client> findAllClients();
}
