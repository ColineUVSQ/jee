package com.uvsq.colinebintou.ecommerce.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.uvsq.colinebintou.ecommerce.form.InscriptionForm;
import com.uvsq.colinebintou.ecommerce.modele.Administrateur;
import com.uvsq.colinebintou.ecommerce.modele.Client;
import com.uvsq.colinebintou.ecommerce.modele.Panier;
import com.uvsq.colinebintou.ecommerce.service.ServiceLoginAdminImpl;
import com.uvsq.colinebintou.ecommerce.service.ServiceLoginClientImpl;
import com.uvsq.colinebintou.ecommerce.service.ServicePanierImpl;

public class InscriptionAction extends Action {
	private ServiceLoginClientImpl serviceClient = null;
	private ServiceLoginAdminImpl serviceAdmin = null;
	private ServicePanierImpl servicePanier = null;

	public void setServiceClient(ServiceLoginClientImpl serviceClient) {
		this.serviceClient = serviceClient;
	}

	public void setServiceAdmin(ServiceLoginAdminImpl serviceAdmin) {
		this.serviceAdmin = serviceAdmin;
	}

	public void setServicePanier(ServicePanierImpl servicePanier) {
		this.servicePanier = servicePanier;
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		InscriptionForm donnees = (InscriptionForm) form;
		System.out.println("je suis dans action"+ donnees.getPassword() + donnees.getConfirmPassword() + donnees.getNom() + donnees.getEmail());
		
		if(donnees.getPassword().equals(donnees.getConfirmPassword())) {
			if(donnees.getPassword().equals("colinebintou")) {
				Administrateur a = new Administrateur();
				a.setLogin(donnees.getEmail());
				a.setNom(donnees.getNom());
				a.setPassword(donnees.getPassword());
				serviceAdmin.creerAdmin(a);
				HttpSession maSession = request.getSession(true); // si pas de session, en cree une
				maSession.setAttribute("admin", a);	
				return mapping.findForward("accueilAdmin");
			}
			else {
				Client c = new Client();
				c.setLogin(donnees.getEmail());
				c.setNom(donnees.getNom());
				c.setPassword(donnees.getPassword());
				serviceClient.creerClient(c);
				Panier p = new Panier();
				p.setClient(c);
				p.setPaye(false);
				servicePanier.creerPanier(p);
				HttpSession maSession = request.getSession(true); // si pas de session, en cree une
				maSession.setAttribute("client", c);	
				maSession.setAttribute("sonPanier", p);
				return mapping.findForward("accueilClient");
			}
			
		}
		HttpSession maSession = request.getSession(true); // si pas de session, en cree une
		maSession.setAttribute("password1", donnees.getPassword());
		maSession.setAttribute("password2", donnees.getConfirmPassword());		
		return mapping.findForward("erreur");
		
	}
}
