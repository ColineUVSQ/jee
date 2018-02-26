package com.uvsq.colinebintou.ecommerce.service;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uvsq.colinebintou.ecommerce.dao.AdministrateurDAOImpl;
import com.uvsq.colinebintou.ecommerce.dao.CdDAOImpl;
import com.uvsq.colinebintou.ecommerce.dao.ClientDAOImpl;
import com.uvsq.colinebintou.ecommerce.dao.DvdDAOImpl;
import com.uvsq.colinebintou.ecommerce.dao.LivreDAOImpl;
import com.uvsq.colinebintou.ecommerce.dao.PanierDAO;
import com.uvsq.colinebintou.ecommerce.modele.*;


public class App {
	
	public static void main(String[] args) {
		Client c = new Client();
		c.setLogin("abc");
		c.setId(1);
		c.setPassword("def");
		c.setNom("ramou");
		System.out.println(c.getId());
		System.out.println(c.toString());
		
		Livre l = new Livre();
		l.setId(2);
		l.setAuteur("jkl");
		l.setNom("ijhu");
		l.setPrix(20.5);
		l.setQuantite(1);
		/*System.out.println(l.calculPrix());
		System.out.println(l.getAuteur());
		System.out.println(l.toString());*/
		
		CD cd = new CD();
		cd.setId(3);
		cd.setArtiste("1236");
		cd.setNom("ksol");
		cd.setPrix(15);
		cd.setQuantite(2);
		/*System.out.println(cd.getNom());
		System.out.println(cd.calculPrix());
		System.out.println(cd.toString());*/
		
		DVD d = new DVD();
		d.setId(4);
		d.setNom("doencnl");
		d.setPrix(26);
		d.setQuantite(1);
		d.setRealisateur("doenc");
		/*System.out.println(d.getQuantite());
		System.out.println(d.calculPrix());
		System.out.println(d.toString());*/
		
		Panier p = new Panier();
		p.ajouter(l);
		p.setPaye(false);
		p.ajouter(cd);
		p.ajouter(d);
		p.setClient(c);
		//p.supprimer(cd);
		//p.supprimer(d);
		
		//System.out.println(p.affiche());
		
		c.ajouter(p);
		
		Administrateur a = new Administrateur();
		a.setId(5);
		a.setLogin("dêp");
		a.setPassword("87684");
		a.setNom("elocdjneo");
		System.out.println(a.toString());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); //-> chargement du contexte
		
		//LivreDAOImpl livre = (LivreDAOImpl) context.getBean("daoLivre");
		//CdDAOImpl cddao = (CdDAOImpl) context.getBean("daoCD");
		//DvdDAOImpl dvddao = (DvdDAOImpl) context.getBean("daoDVD");
		//PanierDAO panier = (PanierDAO) context.getBean("daoPanier");
		
		//livre.create(l);
		//cddao.create(cd);
		//dvddao.create(d);
		//panier.create(p);
		
		ServiceGestionLivreImpl serviceL = (ServiceGestionLivreImpl) context.getBean("serviceGestionLivre");
		Livre l2 = serviceL.ajoutLivre(l);
		
		ServiceGestionCDImpl serviceC = (ServiceGestionCDImpl) context.getBean("serviceGestionCD");
		CD c2 = serviceC.ajoutCD(cd);
		
		ServiceGestionDVDImpl serviceD = (ServiceGestionDVDImpl) context.getBean("serviceGestionDVD");
		DVD d2 = serviceD.ajoutDVD(d);
		
		ServiceRechercheArticleImpl servicerec = (ServiceRechercheArticleImpl) context.getBean("serviceRecArt");
		CD cd2 = (CD) servicerec.findByName(cd.getNom());
		
		ServiceModifArticleImpl serviceA = (ServiceModifArticleImpl) context.getBean("serviceGestionArt");
		System.out.println(serviceA.modifArticle(cd2, 12.0));
		
		ServiceLoginClientImpl serviceClient = (ServiceLoginClientImpl) context.getBean("serviceLoginClient");
		Client c1 = serviceClient.creerClient(c);
		//p.setClient(c1);
		
		ServicePanierImpl serviceP = (ServicePanierImpl) context.getBean("servicePanier");
		//serviceP.creerPanier(p);
		serviceP.ajoutPanier(l2, p);
		serviceP.ajoutPanier(c2, p);
		serviceP.ajoutPanier(d2, p);
		
		/*ServiceLoginAdminImpl serviceAdmin = (ServiceLoginAdminImpl) context.getBean("serviceLoginAdmin");
		serviceAdmin.creerAdmin(a);*/
		
		/*ServiceLoginClientImpl service = (ServiceLoginClientImpl) context.getBean("serviceLoginClient");
		service.creerClient(c);
		System.out.println(service.isValid("abc", "def").toString());		
		Set<Client> clients = service.findAllClients();
		for(Client cl : clients) {
			System.out.println(cl.toString());
		}*/
		
		/*ServiceLoginAdminImpl service = (ServiceLoginAdminImpl) context.getBean("serviceLoginAdmin");
		service.creerAdmin(a);
		System.out.println(service.isValid(a.getLogin(), a.getPassword()));
		AdministrateurDAO admin = (AdministrateurDAO) context.getBean("daoAdmin");
		ClientDAOImpl client = (ClientDAOImpl) context.getBean("daoClient");
		admin.create(a);
		System.out.println(admin.findbyId(a));
		
		a.setNom("ramous");
		admin.update(a);
		//admin.delete(a);
		
		
		client.create(c);
		System.out.println(client.findbyId(c));*/
		
		
	}
}
