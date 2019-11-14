package fr.gtm.bovoyages.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


public class Voyage implements Serializable {

	
	private long id;
	private String region;
	private String descriptif;
	
	private Client client;
	
	private DatesVoyage datesVoyage;

	
	private List<Voyageur> voyageurs = new ArrayList<Voyageur>();


	public Voyage() {
	}

	public Voyage(String region, String descriptif, Client client, List<Voyageur> voyageurs) {
		this.region = region;
		this.descriptif = descriptif;
		this.client = client;
		this.voyageurs = voyageurs;
	}

	public Voyage(long id, String region, String descriptif, Client client, List<Voyageur> voyageurs,
			DatesVoyage datesVoyage) {
		super();
		this.id = id;
		this.region = region;
		this.descriptif = descriptif;
		this.client = client;
		this.voyageurs = voyageurs;
		this.datesVoyage = datesVoyage;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Voyageur> getVoyageurs() {
		return voyageurs;
	}

	public void setVoyageurs(List<Voyageur> voyageurs) {
		this.voyageurs = voyageurs;
	}

	@Override
	public String toString() {
		return "Voyage [region=" + region + ", descriptif=" + descriptif + ", client=" + client + ", voyageurs="
				+ voyageurs + "]";
	}

	public DatesVoyage getDatesVoyage() {
		return datesVoyage;
	}

	public void setDatesVoyage(DatesVoyage datesVoyage) {
		this.datesVoyage = datesVoyage;
	}

}
