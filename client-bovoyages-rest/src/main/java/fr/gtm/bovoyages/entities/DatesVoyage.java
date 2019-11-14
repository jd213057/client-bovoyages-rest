package fr.gtm.bovoyages.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


public class DatesVoyage implements Serializable {

	private long id;
	private Date dateAller;
	private Date dateRetour;
	private float prixHT;
	private int nbrePlaces;
	private int deleted;
	private int promotion;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDateAller() {
		return dateAller;
	}
	public void setDateAller(Date dateAller) {
		this.dateAller = dateAller;
	}
	public Date getDateRetour() {
		return dateRetour;
	}
	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}
	public float getPrixHT() {
		return prixHT;
	}
	public void setPrixHT(float prixHT) {
		this.prixHT = prixHT;
	}
	public int getNbrePlaces() {
		return nbrePlaces;
	}
	public void setNbrePlaces(int nbrePlaces) {
		this.nbrePlaces = nbrePlaces;
	}
	@Override
	public String toString() {
		return "DatesVoyage [dateAller=" + dateAller + ", dateRetour=" + dateRetour + ", prixHT=" + prixHT
				+ ", nbrePlaces=" + nbrePlaces + "]";
	}
	public int getDeleted() {
		return deleted;
	}
	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}
	public int getPromotion() {
		return promotion;
	}
	public void setPromotion(int promotion) {
		this.promotion = promotion;
	}
	
	
	
}
