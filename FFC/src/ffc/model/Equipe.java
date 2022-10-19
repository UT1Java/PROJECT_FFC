/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffc.model;

import java.util.Objects;

/**
 *
 * @author Geneviève
 */
public class Equipe {
    //Attribut de la classe "Equipe"
    private int codeEquipe;
    private String nomEquipe;
    private String nomCorrespondant;
    private String telCorrespondant;
    private String emailCorrespondant;
    
    //contructeur de la classe "Equipe
    public Equipe(int codeEquipe, String nomEquipe, String nomCorrespondant, String telCorrespondant, String emailCorrespondant){
        this.codeEquipe=codeEquipe;
        this.nomEquipe=nomEquipe;
        this.nomCorrespondant=nomCorrespondant;
        this.telCorrespondant=telCorrespondant;
        this.emailCorrespondant=emailCorrespondant;
    }

    Equipe() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    ////Génération des getteurs et setteurs de la classe "Equipe"
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
    
    public void AfficherTout(){
        
    }
    
    public void modifInfoEquipe(){
        
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
