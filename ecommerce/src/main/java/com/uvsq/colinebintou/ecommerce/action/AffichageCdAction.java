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

import com.uvsq.colinebintou.ecommerce.service.ServiceRechercheCDImpl;

public class AffichageCdAction extends Action {
	private ServiceRechercheCDImpl service;	
	
	public void setService(ServiceRechercheCDImpl service) {
		this.service = service;
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		System.out.println("suis dans affiche action"+ service);
		//ArrayList<Livre> livres = service.findAllLivre();
		HttpSession maSession = request.getSession(true); // si pas de session, en cree une
		maSession.setAttribute("lesCD", service);
		if(maSession.getAttribute("admin")== null) {
			return mapping.findForward("page_cd");
		}
		else {
			return mapping.findForward("page_cd_admin");
		}
	}
}
