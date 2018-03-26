package com.edensia.jasper.sample;

import java.util.HashMap;
import java.util.Map;

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
    // TODO à positionner dans un fichier properties
	// RESOURCES_PATH est le chemin d'accès aux images utilisées dans le rapport (logo, coche...)
	static String DEVIS_JASPER_FILENAME = "C:\\eclipse-workspaces\\infodb-jasper-training\\DevisLightAMDM\\DevisLight.jrxml";
	static String RESOURCES_PATH = "C:\\eclipse-workspaces\\infodb-jasper-training\\DevisLightAMDM\\resources\\";
	static String DEVIS_PDF_FILENAME = "C:\\Users\\geral\\Desktop\\classic.pdf";
	
	public static void main( String[] args )
    {
        try {
        	// Création de la datasource pour le rapport Jasper
        	// La collection de devis (dans notre cas, un seul devis) est fournie en paramètre
        	JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(DevisFactory.generateCollection());
        	
        	// Chargement et compilation du rapport
            JasperDesign jasperDesign = JRXmlLoader.load(DEVIS_JASPER_FILENAME);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

            // Paramètres à envoyer au rapport (vide dans notre cas)
            Map<String, Object> parameters = new HashMap<String, Object>();
            parameters.put("ResourcesPath", RESOURCES_PATH);

            // Execution du rapport
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, datasource);
            
            // Correctif permettant de supprimer la deuxième page (page blanche)
  	      	jasperPrint.getPages().remove(1);

            // Création du rapport au format PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, DEVIS_PDF_FILENAME);
        } catch (JRException e) {

            e.printStackTrace();
        }
    }

}
