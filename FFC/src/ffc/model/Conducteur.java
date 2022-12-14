/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffc.model;

/**
 *
 * @author Genevieve
 */
public class Conducteur {
    //Attributs de la classe "Conducteur"
    private int numConducteur;
    private String nomConducteur;
    private String prenomConducteur;
    
    //Constructeur de la classe "Conducteur"
    public Conducteur(int numConducteur, String nomConducteur, String prenomConducteur){
        this.numConducteur=numConducteur;
        this.nomConducteur=nomConducteur;
        this.prenomConducteur=prenomConducteur;
    }
    
    //Génération des getteurs et setteurs
    /**
     * @return the numConducteur
     */
    public int getNumConducteur() {
        return numConducteur;
    }

    /**
     * @return the nomConducteur
     */
    public String getNomConducteur() {
        return nomConducteur;
    }

    /**
     * @return the prenomConducteur
     */
    public String getPrenomConducteur() {
        return prenomConducteur;
    }
    
    //Méthodes de la classe Conducteur
    public void afficherTousLesConducteurs(){
        System.out.println(numConducteur + " " + nomConducteur + " " + prenomConducteur);
    }
}
