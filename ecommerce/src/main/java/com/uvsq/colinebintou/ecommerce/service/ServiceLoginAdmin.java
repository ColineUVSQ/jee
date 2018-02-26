package com.uvsq.colinebintou.ecommerce.service;

import java.util.ArrayList;

import com.uvsq.colinebintou.ecommerce.modele.Administrateur;

public interface ServiceLoginAdmin {
	Administrateur creerAdmin(Administrateur a);
	Administrateur isValid(String login, String password);
	Administrateur changePassword(Administrateur c, String newPass);
	ArrayList<Administrateur> findAllAdmins();
}
