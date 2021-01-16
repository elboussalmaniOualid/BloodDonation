package com.ehealth.dondusang.donneur;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import com.ehealth.dondusang.calendrier.Calendrier;

@Entity
@Table(name="Donneur") 
public class Donneur{

   
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
    String nom;
    String prenom;
    String cin;
    String telephone;
    String adresse;
    Date date_naissance;
    String sexe;
    Date dernier_don;
    Boolean etat_sante; // Good-true // Not Good= false
    String groupe_sanguain;
    @OneToOne(mappedBy="donneur")
	Calendrier calendrier;

   

	public Donneur(String nom, String prenom, String cin, String telephone, String adresse, Date date_naissance,
			String sexe, Date dernier_don, Boolean etat_sante, String groupe_sanguain, Calendrier calendrier) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.telephone = telephone;
		this.adresse = adresse;
		this.date_naissance = date_naissance;
		this.sexe = sexe;
		this.dernier_don = dernier_don;
		this.etat_sante = etat_sante;
		this.groupe_sanguain = groupe_sanguain;
		this.calendrier = calendrier;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Donneur() {
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

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public Date getDernier_don() {
		return dernier_don;
	}

	public void setDernier_don(Date dernier_don) {
		this.dernier_don = dernier_don;
	}

	public Boolean getEtat_sante() {
		return etat_sante;
	}

	public void setEtat_sante(Boolean etat_sante) {
		this.etat_sante = etat_sante;
	}

	public String getGroupe_sanguain() {
		return groupe_sanguain;
	}

	public void setGroupe_sanguain(String groupe_sanguain) {
		this.groupe_sanguain = groupe_sanguain;
	}
    
    //     public boolean isEligible() {
    //     Date today=new Date();
    //     long ltime=today.getTime()+8*24*60*60*1000;
    //     Date today8=new Date(ltime);
        
    //     if (this.etat_sante == true && this.sexe == "Homme"  );
    
    //     return false;
    // }
    
    
}
