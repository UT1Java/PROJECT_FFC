/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffc.model;

import java.util.ArrayList;
import java.util.Objects;
import java.lang.Exception;

/**
 *
 * @author Geneviève
 */
public class Equipe {
    //Attribut de la classe "Equipe"
    private int codeEquipe;
    private String nomEquipe;
    private String nationaliteE;
    private String nomCorrespondant;
    private String telCorrespondant;
    private String emailCorrespondant;
    private ArrayList<Coureur> listeCoureurs; //Création liste des coureurs
    private ArrayList<VehiculesAssistances> listeVehicules; //Création d'une liste des véhicules
    
    //contructeur de la classe "Equipe
    public Equipe(int codeEquipe, String nomEquipe, String nationaliteE, String nomCorrespondant, String telCorrespondant, String emailCorrespondant){
        this.codeEquipe=codeEquipe;
        this.nomEquipe=nomEquipe;
        this.nationaliteE=nationaliteE;
        this.nomCorrespondant=nomCorrespondant;
        this.telCorrespondant=telCorrespondant;
        this.emailCorrespondant=emailCorrespondant;
        this.listeCoureurs= new ArrayList<>();
        this.listeVehicules= new ArrayList<>();
    }
    
    //Génération des getteurs et setteurs de la classe "Equipe"
    /**
     * @return the codeEquipe
     */
    public int getCodeEquipe() {
        return codeEquipe;
    }

    /**
     * @return the nomEquipe
     */
    public String getNomEquipe() {
        return nomEquipe;
    }

    /**
     * @return the nomCorrespondant
     */
    public String getNomCorrespondant() {
        return nomCorrespondant;
    }

    /**
     * @return the telCorrespondant
     */
    public String getTelCorrespondant() {
        return telCorrespondant;
    }

    /**
     * @return the emailCorrespondant
     */
    public String getEmailCorrespondant() {
        return emailCorrespondant;
    }
    
    //Méthodes de classe "Equipe"
    public void ajouterCoureurs(Coureur coureur) throws Exception{
         if(this.listeCoureurs.size()>=10){ 
             throw new Exception();
        }
         listeCoureurs.add(coureur);
    }
    
    public void ajouterVehiculesAssistances(VehiculesAssistances vehicule){
        listeVehicules.add(vehicule);
    }
    
    public void supprimerVehicule(VehiculesAssistances vehicule){
        listeVehicules.remove(vehicule);
    }
    
    public void obtenirTousLesCoureurs(){
        for(int i = 0; i<listeCoureurs.size(); i++){
         System.out.println(listeCoureurs.get(i).getNomC());   
        }
    }
    
    //Afficher toutes les informations d'une équipe constitué de coureurs aavec des véhicules affectés
    public void AfficherToutesInfosEquipe(){
        for(int i = 0; i<listeCoureurs.size(); i++){
            for(int j = 0; i<listeVehicules.size(); i++){
                 System.out.println(codeEquipe + " " + nomEquipe+ " " + nomCorrespondant + " " + telCorrespondant
                    + " " + emailCorrespondant + " " + listeCoureurs.get(i).getNomC()+ " " + listeVehicules.get(j).getMarque());
            }
        } 
    }
       
    //Instanciation de Hashtable avec le "Equals"
    @Override
	public boolean equals(Object o) {
		if(o instanceof Equipe e) {
			if(e.codeEquipe==(e.codeEquipe)) {
                            if(e.nomEquipe.equals(e.nomEquipe)){
                                if(e.nomCorrespondant.equals(e.nomCorrespondant)){
                                    if(e.telCorrespondant.equals(e.telCorrespondant)){
                                        if(e.emailCorrespondant.equals(e.emailCorrespondant)){
                                            return true;
                                        }
                                    }
                                }
                            }
			}
		}
		return false;
	}

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.codeEquipe;
        hash = 79 * hash + Objects.hashCode(this.nomEquipe);
        hash = 79 * hash + Objects.hashCode(this.nomCorrespondant);
        hash = 79 * hash + Objects.hashCode(this.telCorrespondant);
        hash = 79 * hash + Objects.hashCode(this.emailCorrespondant);
        return hash;
    }
}
