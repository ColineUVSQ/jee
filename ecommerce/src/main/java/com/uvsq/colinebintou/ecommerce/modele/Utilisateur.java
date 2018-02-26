package com.uvsq.colinebintou.ecommerce.modele;

public abstract class Utilisateur implements IUtilisateur {
	private int id;
	private String login;
	private String password;
	private String nom;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return getId() + " " + getNom() + " " + getLogin() + " " + getPassword() + " ";

	}
}
