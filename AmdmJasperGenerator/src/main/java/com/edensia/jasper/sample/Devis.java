/**
 * 
 */
package com.edensia.jasper.sample;

import java.util.Collection;
import java.util.Date;

/**
 * @author geral
 *
 */
public class Devis {
	
	// informations g�n�rales sur le devis
	Date dateDevis;
	String reference;
	
	// Information Prospect
	String prenom;
	String nom;
	
	// Experience Prospect
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
	
	// Usage
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

	/**
	 * @param reference
	 * @param prenom
	 * @param nom
	 */
	public Devis() {
		super();
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

	/**
	 * @return the garantiesIncluses
	 */
	public Collection<Garantie> getGarantiesIncluses() {
		return garantiesIncluses;
	}

	/**
	 * @param garantiesIncluses the garantiesIncluses to set
	 */
	public void setGarantiesIncluses(Collection<Garantie> garantiesIncluses) {
		this.garantiesIncluses = garantiesIncluses;
	}

	/**
	 * @return the garantiesOptionnellesSelectionnees
	 */
	public Collection<Garantie> getGarantiesOptionnellesSelectionnees() {
		return garantiesOptionnellesSelectionnees;
	}

	/**
	 * @param garantiesOptionnellesSelectionnees the garantiesOptionnellesSelectionnees to set
	 */
	public void setGarantiesOptionnellesSelectionnees(Collection<Garantie> garantiesOptionnellesSelectionnees) {
		this.garantiesOptionnellesSelectionnees = garantiesOptionnellesSelectionnees;
	}

	/**
	 * @return the garantiesComplementaires
	 */
	public Collection<Garantie> getGarantiesComplementaires() {
		return garantiesComplementaires;
	}

	/**
	 * @param garantiesComplementaires the garantiesComplementaires to set
	 */
	public void setGarantiesComplementaires(Collection<Garantie> garantiesComplementaires) {
		this.garantiesComplementaires = garantiesComplementaires;
	}

}
