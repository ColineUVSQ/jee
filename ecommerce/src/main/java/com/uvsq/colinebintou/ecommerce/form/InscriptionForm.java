package com.uvsq.colinebintou.ecommerce.form;

import org.apache.struts.action.ActionForm;

public class InscriptionForm extends ActionForm {
	private String nom;
	private String email;
	private String password;
	private String confirmPassword;
	
	public InscriptionForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
}
