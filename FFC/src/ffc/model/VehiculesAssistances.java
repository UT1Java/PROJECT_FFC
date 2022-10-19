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
public class VehiculesAssistances {
    //Attributs de la classe "VehiculesAssistances"
    private int numImmatriculation;
    private String marque;
    private String typeV;
    private ArrayList<Conducteur> listeConducteurs;
    
    //Constructeur de la classe "VehiculesAssistances"
    public VehiculesAssistances(int numImmatriculation, String marque, String typeV){
        this.numImmatriculation=numImmatriculation;
        this.marque=marque;
        this.typeV=typeV;
        this.listeConducteurs=new ArrayList<>();
    }
    
    //Génération des getteurs et des setteurs
    /**
     * @return the numImmatriculation
     */
    public int getNumImmatriculation() {
        return numImmatriculation;
    }

    /**
     * @return the marque
     */
    public String getMarque() {
        return marque;
    }

    /**
     * @return the typeV
     */
    public String getTypeV() {
        return typeV;
    }
    
    //Méthodes de la classe "VehiculesAssistances
    /*Afficher les informations de tous les véhicules affectés    
    */
    public void AfficherListeVehicules(){
        for(int i = 0; i<listeConducteurs.size(); i++){
            System.out.println(numImmatriculation + " " + marque + " " + typeV + " " + listeConducteurs.get(i).getNomConducteur());
        }
    }
    
    public void ajouterConducteur(Conducteur conducteur){
        listeConducteurs.add(conducteur);
    }
    
    public void supprimerConducteur(Conducteur conducteur){
        listeConducteurs.remove(conducteur);
    }
}
