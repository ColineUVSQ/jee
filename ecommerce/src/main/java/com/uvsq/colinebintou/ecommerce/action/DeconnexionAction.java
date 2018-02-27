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

public class DeconnexionAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		HttpSession maSession = request.getSession(true); // si pas de session, en cree une
		if(maSession.getAttribute("client")!=null) {
			maSession.setAttribute("client", null);
			return mapping.findForward("accueilClient");
		} else {
			maSession.setAttribute("admin", null);
			return mapping.findForward("accueilAdmin");
		}
	}
}
