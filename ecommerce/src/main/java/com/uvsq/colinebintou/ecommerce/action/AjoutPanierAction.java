package com.uvsq.colinebintou.ecommerce.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.uvsq.colinebintou.ecommerce.modele.Client;
import com.uvsq.colinebintou.ecommerce.modele.IPanier;
import com.uvsq.colinebintou.ecommerce.modele.Livre;
import com.uvsq.colinebintou.ecommerce.modele.Panier;
import com.uvsq.colinebintou.ecommerce.service.ServiceLoginClient;
import com.uvsq.colinebintou.ecommerce.service.ServicePanierImpl;
import com.uvsq.colinebintou.ecommerce.service.ServiceRechercheArticleImpl;

public class AjoutPanierAction extends Action {
	private ServicePanierImpl service;
	private ServiceRechercheArticleImpl serviceArt;
	private ServiceLoginClient serviceClient;

	public void setService(ServicePanierImpl service) {
		this.service = service;
	}
	
	public void setServiceClient(ServiceLoginClient serviceClient) {
		this.serviceClient = serviceClient;
	}

	public void setServiceArt(ServiceRechercheArticleImpl serviceArt) {
		this.serviceArt = serviceArt;
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		System.out.println("suis dans affiche action"+ service);
		HttpSession maSession = request.getSession(true); // si pas de session, en cree une
		Client c = (Client) maSession.getAttribute("client");
		System.out.println(request.getParameter("id"));
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		Livre l = (Livre) serviceArt.findById(id);
		System.out.println(l);
		Set<IPanier> paniers = c.getPaniers();
		boolean dejaPanier = false;
		Iterator<IPanier> iterator = paniers.iterator();
		while (iterator.hasNext()) {
		      Panier myCurrentElement = (Panier) iterator.next();
		      if(!myCurrentElement.isPaye()) {
		    	  dejaPanier = true;
				  service.ajoutPanier(l, myCurrentElement);
		      }
		}
		if(dejaPanier == false) {
			Panier p = new Panier();
			p.setPaye(false);
			p.setClient(c);
			service.creerPanier(p);
			c.ajouter(p);
			serviceClient.updateClient(c);
			maSession.setAttribute("client", c);
			
			service.ajoutPanier(l, p);
		}
		
		return mapping.findForward("livres");
	}
}
