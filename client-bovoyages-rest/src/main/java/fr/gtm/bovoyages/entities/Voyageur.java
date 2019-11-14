package fr.gtm.bovoyages.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

public class Voyageur implements Serializable {
	
	

private long id;

private String civilite;
private String nom;
private String prenom;

private LocalDate dateNaissance;


public Voyageur() {}


public Voyageur(long id, String civilite, String nom, String prenom, LocalDate dateNaissance) {
	super();
	this.id = id;
	this.civilite = civilite;
	this.nom = nom;
	this.prenom = prenom;
	this.dateNaissance = dateNaissance;
}


public Voyageur(String civilite, String nom, String prenom, LocalDate dateNaissance) {
	super();
	this.civilite = civilite;
	this.nom = nom;
	this.prenom = prenom;
	this.dateNaissance = dateNaissance;
}


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public String getCivilite() {
	return civilite;
}


public void setCivilite(String civilite) {
	this.civilite = civilite;
}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public String getPrenom() {
	return prenom;
}


public void setPrenom(String prenom) {
	this.prenom = prenom;
}


public LocalDate getDateNaissance() {
	return dateNaissance;
}


public void setDateNaissance(LocalDate dateNaissance) {
	this.dateNaissance = dateNaissance;
}


@Override
public String toString() {
	return "Voyageurs [civilite=" + civilite + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance="
			+ dateNaissance + "]";
}


}
