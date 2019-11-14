package fr.gtm.bovoyages.entities;

import java.io.Serializable;

import javax.persistence.*;

public class Client implements Serializable {

	private long id;
	private String nom;
	
	public Client() {}

	public Client(long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	
	

	public Client(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + "]";
	}
	
	

}
