/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffc.model;

import java.util.ArrayList;

/**
 *
 * @author Geneviève
 */
public class InscriptionC {
    //Constructeur de la classe "InscriptionC"
    private int numIncriptionC;
    private String etatInscriptionC;
    private String dateInscription;
    private String etatCoureur;
    private ArrayList<Coureur> listeCoureur;
    
    //Construteur de la classe "InscriptionC"
    public InscriptionC(int numIncriptionC, String etatInscriptionC, String dateInscription, String etatCoureur){
        this.numIncriptionC=numIncriptionC;
        this.etatInscriptionC=etatInscriptionC;
        this.dateInscription=dateInscription;
        this.etatCoureur=etatCoureur;
        this.listeCoureur= new ArrayList<>();
    }
    
    //Génération des getteurs et des setteurs

    /**
     * @return the numIncriptionC
     */
    public int getNumIncriptionC() {
        return numIncriptionC;
    }

    /**
     * @return the etatInscriptionC
     */
    public String getEtatInscriptionC() {
        return etatInscriptionC;
    }

    /**
     * @param etatInscriptionC the etatInscriptionC to set
     */
    public void setEtatInscriptionC(String etatInscriptionC) {
        this.etatInscriptionC = etatInscriptionC;
    }

    /**
     * @return the dateInscription
     */
    public String getDateInscription() {
        return dateInscription;
    }

    /**
     * @return the etatCoureur
     */
    public String getEtatCoureur() {
        return etatCoureur;
    }

    /**
     * @param etatCoureur the etatCoureur to set
     */
    public void setEtatCoureur(String etatCoureur) {
        this.etatCoureur = etatCoureur;
    }
    
    //Méthodes de la classe "InscriptionC"
    public void InscriptionCoureur(){
        
    }
    
    //Obtenir un coureur dont l'inscription est validée
    public Coureur obtrenirCoureur(){
        
        return null;
    }
    
    public void ajouterCoureur(Coureur coureur){
        listeCoureur.add(coureur);
    }
    
    public void supprimerInscriptionCoureur(Coureur coureur){
        listeCoureur.remove(coureur);
    }
}
