/**
 * 
 */
package com.edensia.jasper.sample;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.Vector;

/**
 * @author geral
 *
 */
public class DevisFactory {

	public static java.util.Collection<Devis> generateCollection() {
		// Creates the collection
		java.util.Vector<Devis> collection = new Vector<Devis>();

		// Adds the values in the bean and adds it into the collection
		Devis devis = new Devis();
		devis.setReference("20180306114401");
		devis.setPrenom("Gérald");
		devis.setNom("BENOIT");
		devis.setCrmAuto(0.5);
		devis.setCrmMoto(0.5);
		devis.setCylindree("500");
		devis.setDateDevis(new Date());
		devis.setDateMEC(new Date());
		devis.setLibelleFormule("Vol");
		devis.setMarque("Honda");
		devis.setModele("CMX500 Rebel");
		devis.setNbAccidentsRespAuto(0);
		devis.setNbAccidentsRespMoto(0);
		devis.setNbAnneesAssuranceAuto(10);
		devis.setNbAnneesAssuranceMoto(10);
		devis.setTarifAnnuel(576.0);
		devis.setTarifMensuel(37.0);
		devis.setUsageVehicule("Promenade");
		devis.setCpLieuGarage("31840");
		devis.setVilleLieuGarage("AUSSONNE");
		
		Collection<Garantie> garantiesIncluses = new LinkedList<Garantie>();
		garantiesIncluses.add(new Garantie("SAVE","Soutien et Accompagnement des Victimes et de leur Entourage"));	
		garantiesIncluses.add(new Garantie("Jurimotard","Protection juridique de votre vie quotidienne et de votre permis de conduire"));	
		garantiesIncluses.add(new Garantie("Responsabilité Civile",""));
		garantiesIncluses.add(new Garantie("Protection et Défense de vos droits",""));
		garantiesIncluses.add(new Garantie("Protection Conducteurs Solidaire","jusqu'à 80 000€"));
		garantiesIncluses.add(new Garantie("Assistance 0 km","soyez dépanné en bas de chez vous !"));
		garantiesIncluses.add(new Garantie("Equipement conducteur","jusqu'à 1000 €"));
		garantiesIncluses.add(new Garantie("Avance Recours Matériel",""));
		garantiesIncluses.add(new Garantie("Vol","remboursement sous 15 jours"));
		garantiesIncluses.add(new Garantie("Incendie, Attentats, Catastrophes Naturelles, Forces de la nature",""));
		garantiesIncluses.add(new Garantie("Bris de Glace","Sans franchise"));		
		devis.setGarantiesIncluses(garantiesIncluses);

		Collection<Garantie> garantiesOptionnellesSelectionnees = new LinkedList<Garantie>();
		garantiesOptionnellesSelectionnees.add(new Garantie("Protection Conducteurs Renforc�e","Jusqu'à 200 000 €"));	
		garantiesOptionnellesSelectionnees.add(new Garantie("Equipement Conducteur Optimale","Jusqu'à 2000 €"));	
		devis.setGarantiesOptionnellesSelectionnees(garantiesOptionnellesSelectionnees);

		Collection<Garantie> garantiesComplementaires = new LinkedList<Garantie>();
		garantiesComplementaires.add(new Garantie("Protection conducteur","jusqu'à 500 000 €"));	
		garantiesComplementaires.add(new Garantie("Assistance 0km","+ véhicule de remplacement"));	
		garantiesComplementaires.add(new Garantie("Equipements","remboursés jusqu'à 2000 €"));	
		garantiesComplementaires.add(new Garantie("Accessoires","remboursés jusqu'à 9000 €"));	
		devis.setGarantiesComplementaires(garantiesComplementaires);
		
		collection.add(devis);

		// returns the collection of beans.
		return collection;
		}

}
