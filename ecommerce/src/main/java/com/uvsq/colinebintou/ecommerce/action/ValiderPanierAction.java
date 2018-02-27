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

import com.uvsq.colinebintou.ecommerce.modele.Client;
import com.uvsq.colinebintou.ecommerce.modele.Panier;
import com.uvsq.colinebintou.ecommerce.service.ServicePanierImpl;

public class ValiderPanierAction extends Action {
	private ServicePanierImpl service;

	public void setService(ServicePanierImpl service) {
		this.service = service;
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		System.out.println("suis dans affiche action"+ service);
		HttpSession maSession = request.getSession(true); // si pas de session, en cree une
		Client c = (Client) maSession.getAttribute("client");
		Panier p = (Panier) maSession.getAttribute("sonPanier");
		service.validerPanier(p);
		Panier p2 = new Panier();
		p2.setClient(c);
		p2.setPaye(false);
		//c.ajouter(p2);
		service.creerPanier(p2);
		maSession.setAttribute("sonPanier", p2);
		maSession.setAttribute("client", c);
		
		return mapping.findForward("achatValide");
	}
}
