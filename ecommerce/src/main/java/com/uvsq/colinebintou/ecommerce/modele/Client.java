package com.uvsq.colinebintou.ecommerce.modele;

import java.util.HashSet;
import java.util.Set;

public class Client extends Utilisateur implements IUtilisateur {
	private Set<IPanier> paniers;
	
	public Client() {
		super();
		paniers = new HashSet<IPanier>();
	}

	public Set<IPanier> getPaniers() {
		return paniers;
	}


	public void setPaniers(Set<IPanier> paniers) {
		this.paniers = paniers;
	}
	
	public boolean ajouter(IPanier p) {
		if(paniers.add(p)) return true;
		else return false;
	}
	
	public boolean supprimer(IPanier p) {
		if(paniers.remove(p)) return true;
		else return false;
	}
	
	@Override
	public String toString() {
		String chaine = super.toString() + "\nses commandes :";
		int i = 1;
		for (IPanier p : paniers) {
			chaine += "panier numero " + i + "\n" + p.affiche();
			chaine += "\n";
			i++;
		}
		return chaine;
	}
}
