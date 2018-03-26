package com.edensia.jasper.sample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Devis implements Serializable {

	private static final long serialVersionUID = 558483202938452810L;

	// informations générales sur le devis
	Date dateDevis;
	String reference;

	// Information prospect
	String prenom;
	String nom;
	String codePrescripteur;

	// Experience prospect
	Double crmMoto;
	Integer nbAccidentsRespMoto;
	Integer nbAnneesAssuranceMoto;
	Double crmAuto;
	Integer nbAccidentsRespAuto;
	Integer nbAnneesAssuranceAuto;

	// Vehicule
	Date dateMEC;
	String marque;
	String cylindree;
	String modele;
	String appellation;
	String usageVehicule;
	String cpLieuGarage;
	String villeLieuGarage;

	// Formule choisie
	String libelleFormule;
	String codeFormule;
	Double tarifAnnuel;
	Double tarifMensuel;

	// Garanties
	Collection<Garantie> garantiesIncluses;
	Collection<Garantie> garantiesOptionnellesSelectionnees;
	Collection<Garantie> garantiesComplementaires;

	public Devis() {
		garantiesIncluses = new ArrayList<>();
		garantiesOptionnellesSelectionnees = new ArrayList<>();
		garantiesComplementaires = new ArrayList<>();
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCodePrescripteur() {
		return codePrescripteur;
	}

	public void setCodePrescripteur(String codePrescripteur) {
		this.codePrescripteur = codePrescripteur;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public Date getDateDevis() {
		return dateDevis;
	}

	public void setDateDevis(Date dateDevis) {
		this.dateDevis = dateDevis;
	}

	public Double getCrmMoto() {
		return crmMoto;
	}

	public void setCrmMoto(Double crmMoto) {
		this.crmMoto = crmMoto;
	}

	public Integer getNbAccidentsRespMoto() {
		return nbAccidentsRespMoto;
	}

	public void setNbAccidentsRespMoto(Integer nbAccidentsRespMoto) {
		this.nbAccidentsRespMoto = nbAccidentsRespMoto;
	}

	public Integer getNbAnneesAssuranceMoto() {
		return nbAnneesAssuranceMoto;
	}

	public void setNbAnneesAssuranceMoto(Integer nbAnneesAssuranceMoto) {
		this.nbAnneesAssuranceMoto = nbAnneesAssuranceMoto;
	}

	public Double getCrmAuto() {
		return crmAuto;
	}

	public void setCrmAuto(Double crmAuto) {
		this.crmAuto = crmAuto;
	}

	public Integer getNbAccidentsRespAuto() {
		return nbAccidentsRespAuto;
	}

	public void setNbAccidentsRespAuto(Integer nbAccidentsRespAuto) {
		this.nbAccidentsRespAuto = nbAccidentsRespAuto;
	}

	public Integer getNbAnneesAssuranceAuto() {
		return nbAnneesAssuranceAuto;
	}

	public void setNbAnneesAssuranceAuto(Integer nbAnneesAssuranceAuto) {
		this.nbAnneesAssuranceAuto = nbAnneesAssuranceAuto;
	}

	public Date getDateMEC() {
		return dateMEC;
	}

	public void setDateMEC(Date dateMEC) {
		this.dateMEC = dateMEC;
	}

	public String getCylindree() {
		return cylindree;
	}

	public void setCylindree(String cylindree) {
		this.cylindree = cylindree;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getAppellation() {
		return appellation;
	}

	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}

	public String getUsageVehicule() {
		return usageVehicule;
	}

	public void setUsageVehicule(String usageVehicule) {
		this.usageVehicule = usageVehicule;
	}

	public String getCpLieuGarage() {
		return cpLieuGarage;
	}

	public void setCpLieuGarage(String cpLieuGarage) {
		this.cpLieuGarage = cpLieuGarage;
	}

	public String getVilleLieuGarage() {
		return villeLieuGarage;
	}

	public void setVilleLieuGarage(String villeLieuGarage) {
		this.villeLieuGarage = villeLieuGarage;
	}

	public String getLibelleFormule() {
		return libelleFormule;
	}

	public void setLibelleFormule(String libelleFormule) {
		this.libelleFormule = libelleFormule;
	}

	public String getCodeFormule() {
		return codeFormule;
	}

	public void setCodeFormule(String codeFormule) {
		this.codeFormule = codeFormule;
	}

	public Double getTarifAnnuel() {
		return tarifAnnuel;
	}

	public void setTarifAnnuel(Double tarifAnnuel) {
		this.tarifAnnuel = tarifAnnuel;
	}

	public Double getTarifMensuel() {
		return tarifMensuel;
	}

	public void setTarifMensuel(Double tarifMensuel) {
		this.tarifMensuel = tarifMensuel;
	}

	public Collection<Garantie> getGarantiesIncluses() {
		return garantiesIncluses;
	}

	public void setGarantiesIncluses(Collection<Garantie> garantiesIncluses) {
		this.garantiesIncluses = garantiesIncluses;
	}

	public void addGarantieIncluse(Garantie garantie) {
		this.garantiesIncluses.add(garantie);
	}

	public Collection<Garantie> getGarantiesOptionnellesSelectionnees() {
		return garantiesOptionnellesSelectionnees;
	}

	public void setGarantiesOptionnellesSelectionnees(Collection<Garantie> garantiesOptionnellesSelectionnees) {
		this.garantiesOptionnellesSelectionnees = garantiesOptionnellesSelectionnees;
	}

	public void addGarantieOptionnelleSelectionnee(Garantie garantie) {
		this.garantiesOptionnellesSelectionnees.add(garantie);
	}

	public Collection<Garantie> getGarantiesComplementaires() {
		return garantiesComplementaires;
	}

	public void setGarantiesComplementaires(Collection<Garantie> garantiesComplementaires) {
		this.garantiesComplementaires = garantiesComplementaires;
	}

	public void addGarantieComplementaire(Garantie garantie) {
		this.garantiesComplementaires.add(garantie);
	}

	@Override
	public String toString() {
		return "Devis :"
				+ "\n dateDevis :  " + dateDevis 
				+ ",\n  reference :  " + reference 
				+ ",\n  prenom :  " + prenom 
				+ ",\n  nom :  " + nom
				+ ",\n  codePrescripteur :  " + codePrescripteur 
				+ ",\n  crmMoto :  " + crmMoto 
				+ ",\n  nbAccidentsRespMoto :  " + nbAccidentsRespMoto 
				+ ",\n  nbAnneesAssuranceMoto="  + nbAnneesAssuranceMoto 
				+ ",\n  crmAuto :  " + crmAuto
				+ ",\n  nbAccidentsRespAuto :  " + nbAccidentsRespAuto 
				+ ",\n  nbAnneesAssuranceAuto :  " + nbAnneesAssuranceAuto
				+ ",\n  dateMEC :  " + dateMEC 
				+ ",\n  marque :  " + marque 
				+ ",\n  cylindree :  " + cylindree 
				+ ",\n  modele :  " + modele
				+ ",\n  appellation :  " + appellation 
				+ ",\n  usageVehicule :  " + usageVehicule 
				+ ",\n  cpLieuGarage :  " + cpLieuGarage
				+ ",\n  villeLieuGarage :  " + villeLieuGarage 
				+ ",\n  libelleFormule :  " + libelleFormule 
				+ ",\n  codeFormule :  " + codeFormule 
				+ ",\n  tarifAnnuel :  " + tarifAnnuel 
				+ ",\n  tarifMensuel :  " + tarifMensuel
				+ ",\n  garantiesIncluses :  " + garantiesIncluses 
				+ ",\n  garantiesOptionnellesSelectionnees :  " + garantiesOptionnellesSelectionnees 
				+ ",\n  garantiesComplementaires :  " + garantiesComplementaires 
				+ "]";
	}

}
