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

import com.uvsq.colinebintou.ecommerce.modele.Article;
import com.uvsq.colinebintou.ecommerce.modele.Client;
import com.uvsq.colinebintou.ecommerce.modele.Livre;
import com.uvsq.colinebintou.ecommerce.modele.Panier;
import com.uvsq.colinebintou.ecommerce.service.ServiceModifArticleImpl;
import com.uvsq.colinebintou.ecommerce.service.ServicePanierImpl;
import com.uvsq.colinebintou.ecommerce.service.ServiceRechercheArticleImpl;

public class AjoutPanierAction extends Action {
	private ServicePanierImpl service;
	private ServiceRechercheArticleImpl serviceArt;
	private ServiceModifArticleImpl serviceModif;

	public void setService(ServicePanierImpl service) {
		this.service = service;
	}
	
	public void setServiceArt(ServiceRechercheArticleImpl serviceArt) {
		this.serviceArt = serviceArt;
	}

	public void setServiceModif(ServiceModifArticleImpl serviceModif) {
		this.serviceModif = serviceModif;
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		System.out.println("suis dans affiche action"+ service);
		HttpSession maSession = request.getSession(true); // si pas de session, en cree une
		Client c = (Client) maSession.getAttribute("client");
		System.out.println(request.getParameter("id"));
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		Article a = serviceArt.findById(id);
		System.out.println(a);
		
		Panier p = (Panier) maSession.getAttribute("sonPanier");
		p.setClient(c);
		service.ajoutPanier(a, p);
		System.out.println("je suis ici");
		System.out.println(p);
		serviceModif.modifArticle(a, a.getQuantite()-1);
		maSession.setAttribute("sonPanier", p);
		maSession.setAttribute("client", c);
		
		return mapping.findForward("accueil");
	}
}
