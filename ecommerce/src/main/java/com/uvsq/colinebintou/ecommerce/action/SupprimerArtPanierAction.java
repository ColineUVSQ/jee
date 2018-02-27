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
import com.uvsq.colinebintou.ecommerce.modele.Panier;
import com.uvsq.colinebintou.ecommerce.service.ServiceModifArticleImpl;
import com.uvsq.colinebintou.ecommerce.service.ServicePanier;
import com.uvsq.colinebintou.ecommerce.service.ServiceRechercheArticle;

public class SupprimerArtPanierAction extends Action {
	private ServicePanier service;
	private ServiceRechercheArticle serviceArt;
	private ServiceModifArticleImpl serviceModif;

	public void setService(ServicePanier service) {
		this.service = service;
	}

	public void setServiceArt(ServiceRechercheArticle serviceArt) {
		this.serviceArt = serviceArt;
	}

	public void setServiceModif(ServiceModifArticleImpl serviceModif) {
		this.serviceModif = serviceModif;
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		System.out.println("suis dans affiche action"+ service);
		HttpSession maSession = request.getSession(true);
		int id = Integer.parseInt(request.getParameter("id"));
		Article a = serviceArt.findById(id);
		Panier p = (Panier) maSession.getAttribute("sonPanier");
		service.suppPanier(a, p);
		serviceModif.modifArticle(a, a.getQuantite()+1);
		maSession.setAttribute("sonPanier", p);
		return mapping.findForward("panier");
	}
}
