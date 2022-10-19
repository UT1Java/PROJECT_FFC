/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffc.model;

/**
 *
 * @author sunweichen
 */
public class InscriptionC {
    //Constructeur de la classe "InscriptionC"
    private int numIncriptionC;
    private String etatInscriptionC;
    private String dateInscription;
    private String etatCoureur;
    
    //Construteur de la classe "InscriptionC"
    public InscriptionC(int numIncriptionC,String etatInscriptionC,String dateInscription,String etatCoureur){
        this.dateInscription=dateInscription;
        this.numIncriptionC=numIncriptionC;
        this.etatCoureur=etatCoureur;
        this.etatInscriptionC=etatInscriptionC;
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
    
    public Coureur obtrenirCoureur(){
        
        return null;
    }
    
    public void ajouterCoureur(){
        
    }
    
    public void supprimerInscriptionCoureur(){
        
    }
    
    public void modifEtatInscriptionC(){
        
    }
    
    public void modifEtatCoureur(){
        
    }
}
