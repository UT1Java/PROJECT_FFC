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
public class InscriptionE {
    private int numInscriptionE;
    private String etatInscriptionE;
    private String dateInscriptionE;
    private String etatEquipe;
    private ArrayList<Equipe> listeEquipes; //Création d'une liste d'équipes
    
    //Constructeur de la classe "InscriptionE"
    public InscriptionE(int numInscriptionE, String etatInscriptionE, String dateInscriptionE, String etatEquipe){
        this.numInscriptionE=numInscriptionE;
        this.etatInscriptionE=etatInscriptionE;
        this.dateInscriptionE=dateInscriptionE;
        this.etatEquipe=etatEquipe;
        this.listeEquipes= new ArrayList<>();
    }
    /**
     * @return the numInscriptionE
     */
    public int getNumInscriptionE() {
        return numInscriptionE;
    }

    /**
     * @return the etatInscriptionE
     */
    public String getEtatInscriptionE() {
        return etatInscriptionE;
    }

    /**
     * @return the dateInscriptionE
     */
    public String getDateInscriptionE() {
        return dateInscriptionE;
    }

    /**
     * @return the etatEquipe
     */
    public String getEtatEquipe() {
        return etatEquipe;
    }

    /**
     * @param etatEquipe the etatEquipe to set
     */
    public void setEtatEquipe(String etatEquipe) {
        this.etatEquipe = etatEquipe;
    }
    
    //Méthodes de la classe "InscriptionE"
    public void ajouterEquipe(Equipe equipe){
        listeEquipes.add(equipe);
    }
    
    public void supprimerEquipe(Equipe equipe){
        listeEquipes.remove(equipe);
    }
    
    /*Cette méthode permets de récupérer tous les coureurs inscrits (ceux qui sont créés)
    de n'importe quelle équipes
    */
    public InscriptionC obtenirListeCoureurs(){
        
        return null;  
    }
    
    //Afficher la liste de coureurs inscrit dans une équipe
    public void afficherListeCoureurs(){
        
    }
    
    //Afficher tous les véhicules affactés pour toutes les différentes équipes
    public void afficherListeVehiculesAssistances(){
        System.out.println();
    }
}
