/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffc.model;

public class InscriptionC {
   
    private int numIncriptionC;
    private String etatInscriptionC;
    private String dateInscription;
    private String etatCoureur;

    public InscriptionC(int numIncriptionC, String etatInscriptionC, String dateInscription, String etatCoureur){
        this.numIncriptionC=numIncriptionC;
        this.etatInscriptionC=etatInscriptionC;
        this.dateInscription=dateInscription;
        this.etatCoureur=etatCoureur;
    }
    
    public int getNumIncriptionC() {
        return numIncriptionC;
    }

    public String getEtatInscriptionC() {
        return etatInscriptionC;
    }

    public void setEtatInscriptionC(String etatInscriptionC) {
        this.etatInscriptionC = etatInscriptionC;
    }

    public String getDateInscription() {
        return dateInscription;
    }

    public String getEtatCoureur() {
        return etatCoureur;
    }

    public void setEtatCoureur(String etatCoureur) {
        this.etatCoureur = etatCoureur;
    }
    

 
    
    
  
}
