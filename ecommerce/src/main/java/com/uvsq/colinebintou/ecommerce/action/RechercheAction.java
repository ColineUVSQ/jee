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

import com.uvsq.colinebintou.ecommerce.service.ServiceRechercheArticleImpl;


public class RechercheAction extends Action {
	private ServiceRechercheArticleImpl service;
	
	public void setService(ServiceRechercheArticleImpl service) {
		this.service = service;
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		System.out.println("je suis dans action");
		HttpSession maSession = request.getSession(true); // si pas de session, en cree une
		maSession.setAttribute("articles", service.findAllDispo());
		return mapping.findForward("recherche");
	}
		
}
