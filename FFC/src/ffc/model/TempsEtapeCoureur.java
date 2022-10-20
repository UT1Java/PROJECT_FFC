/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffc.model;

/**
 *
 * @author sunweichen
 */
public class TempsEtapeCoureur {
    public float tempsE;
    public String EtatTempsEtape="inverifie";
    
    public TempsEtapeCoureur(float t){
        this.tempsE=t;
    }
    public float getTempsEtape(){
        return this.tempsE;
    }
    
    public void validerTemps(){
        this.EtatTempsEtape="Valide";    
    }
    
     public void invaliderTemps(){
        this.EtatTempsEtape="Invalide";    
    }
}
