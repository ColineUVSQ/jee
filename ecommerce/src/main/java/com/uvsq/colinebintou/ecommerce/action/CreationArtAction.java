package com.uvsq.colinebintou.ecommerce.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.uvsq.colinebintou.ecommerce.form.CreationArtForm;
import com.uvsq.colinebintou.ecommerce.modele.CD;
import com.uvsq.colinebintou.ecommerce.modele.DVD;
import com.uvsq.colinebintou.ecommerce.modele.Livre;
import com.uvsq.colinebintou.ecommerce.service.ServiceGestionCD;
import com.uvsq.colinebintou.ecommerce.service.ServiceGestionCDImpl;
import com.uvsq.colinebintou.ecommerce.service.ServiceGestionDVD;
import com.uvsq.colinebintou.ecommerce.service.ServiceGestionDVDImpl;
import com.uvsq.colinebintou.ecommerce.service.ServiceGestionLivre;
import com.uvsq.colinebintou.ecommerce.service.ServiceGestionLivreImpl;

public class CreationArtAction extends Action {
	private ServiceGestionLivre serviceGestionLivre = null;
	private ServiceGestionCD serviceGestionCD = null;
	private ServiceGestionDVD serviceGestionDVD = null;
	
	public void setServiceGestionLivre(ServiceGestionLivre serviceGestionLivre) {
		this.serviceGestionLivre = serviceGestionLivre;
	}

	public void setServiceGestionCD(ServiceGestionCD serviceGestionCD) {
		this.serviceGestionCD = serviceGestionCD;
	}

	public void setServiceGestionDVD(ServiceGestionDVD serviceGestionDVD) {
		this.serviceGestionDVD = serviceGestionDVD;
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		CreationArtForm donnees = (CreationArtForm) form;
		System.out.println("je suis dans action"+ donnees.getType());
		
		if(donnees.getType().equals("Livres")) {
			Livre l = new Livre();
			l.setNom(donnees.getNom());
			l.setPrix(donnees.getPrix());
			l.setQuantite(donnees.getQuantite());
			l.setAuteur(donnees.getAuteur());
			//ServiceGestionLivreImpl service = (ServiceGestionLivreImpl) getWebApplicationContext().getBean("serviceGestionLivre");
			//service.ajoutLivre(l);
			serviceGestionLivre.ajoutLivre(l);
		}
		else if(donnees.getType().equals("CD")) {
			CD c = new CD();
			c.setNom(donnees.getNom());
			c.setPrix(donnees.getPrix());
			c.setQuantite(donnees.getQuantite());
			c.setArtiste(donnees.getArtiste());
			//ServiceGestionCDImpl service = (ServiceGestionCDImpl) getWebApplicationContext().getBean("serviceGestionCD");			
			//service.ajoutCD(c);
			serviceGestionCD.ajoutCD(c);
		}
		else {
			DVD d = new DVD();
			d.setNom(donnees.getNom());
			d.setPrix(donnees.getPrix());
			d.setQuantite(donnees.getQuantite());
			d.setRealisateur(donnees.getRealisateur());
			//ServiceGestionDVDImpl service = (ServiceGestionDVDImpl) getWebApplicationContext().getBean("serviceGestionDVD");
			//service.ajoutDVD(d);
			serviceGestionDVD.ajoutDVD(d);
		}
	return mapping.findForward("accueil");
	}
}
