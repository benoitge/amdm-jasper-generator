package com.edensia.jasper.sample;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void main( String[] args )
    {
         
		// RESOURCES_PATH est le chemin d'accès aux images utilisées dans le rapport (logo, coche...)
		String DEVIS_JASPER_FILENAME = args[1];/*"C:\\Users\\gerald benoit\\git\\amdm-jasperreports\\DevisLightAMDM\\DevisLight.jrxml";*/
		String DEVIS_EXPORT_PATH = args[2];/*"C:\\report\\";*/
		String JRXML_RESOURCES_PATH = args[3];/*"C:\\Users\\gerald benoit\\git\\amdm-jasperreports\\DevisLightAMDM\\resources\\";*/
		
		try {
        	// Récupération du devis au format JSON
        	ObjectMapper mapper = new ObjectMapper();
        	Devis devis = mapper.readValue(new File(DEVIS_EXPORT_PATH+args[0]+".json"), Devis.class);        	        	
        	
        	// Création de la datasource pour le rapport Jasper
        	// La collection de devis (dans notre cas, un seul devis) est fournie en paramètre
        	Collection<Devis> collectionDevis = new LinkedList<Devis>();
        	collectionDevis.add(devis);
        	JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(collectionDevis/*DevisFactory.generateCollection()*/);
        	
        	// Chargement et compilation du rapport
            System.out.println("DEVIS_JASPER_FILENAME = "+DEVIS_JASPER_FILENAME);
            JasperDesign jasperDesign = JRXmlLoader.load(DEVIS_JASPER_FILENAME);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

            // Paramètres à envoyer au rapport (vide dans notre cas)
            System.out.println("JRXML_RESOURCES_PATH = "+JRXML_RESOURCES_PATH);
            Map<String, Object> parameters = new HashMap<String, Object>();
            parameters.put("ResourcesPath", JRXML_RESOURCES_PATH);

            // Execution du rapport
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, datasource);
            
            // Correctif permettant de supprimer la deuxième page (page blanche)
  	      	// jasperPrint.getPages().remove(1);

            // Création du rapport au format PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, DEVIS_EXPORT_PATH+args[0]+".pdf");

		} catch (JRException | IOException e) {
            e.printStackTrace();
        } 
    }

}
