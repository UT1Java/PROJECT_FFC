/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffc;

/**
 *
 * @author sunweichen
 */
public class Edition {
    public String dateDebut;
    public String dateFin;
    public String annee;
    public String etatEdition;
    
    public Edition(String annee, String dateDebut, String dateFin, String etatEdition){
        this.annee=annee;
        this.dateDebut=dateDebut;
        this.dateFin=dateFin;
        this.etatEdition=etatEdition;
    }
    
    public void inscrireEquipe(){}
    
    public void inscrireCoureur(){}
    
    public void modifEtatEdition(){}
    
    public void etablirClassementDefinitifCoureur(){}
    
    public void etablirClassementDefinitifEquipe(){}
           
}
