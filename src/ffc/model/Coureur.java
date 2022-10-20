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
public class Coureur {
    //Attribut de la classe "Coureur"
    private int codeCoureur ;
    private String nomC;
    private String dateNaissance;
    private String rhesus;
    private String groupSang ;
	
    //Constructeur de la classe
    public Coureur(int codeCoureur, String nomC, String dateNaissance, String rhesus, String groupSang){
        this.codeCoureur= codeCoureur;
        this.nomC=nomC;
        this.dateNaissance=dateNaissance;
        this.groupSang=groupSang;
        this.rhesus=rhesus;
    }

    public int getCodeCoureur() {
        return codeCoureur;
    }

    public String getNomC() {
        return nomC;
    }

    public String getDateNaissanceString() {
        return dateNaissance;
    }

    public String getRhesus() {
        return rhesus;
    }

    public void setRhesus(String rhesus) {
        this.rhesus = rhesus;
    }

    public String getGroupSang() {
        return groupSang;
    }

    public void setGroupSang(String groupSang) {
        this.groupSang = groupSang;
    }

    @Override
	public boolean equals(Object o) {
		if(o instanceof Coureur c) {
			if(c.codeCoureur==(c.codeCoureur)) {
                            if(c.nomC.equals(c.nomC)){
                                if(c.dateNaissance.equals(c.dateNaissance)){
                                    if(c.rhesus.equals(c.rhesus)){
                                        if(c.groupSang.equals(c.groupSang)){
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
        hash = 19 * hash + this.codeCoureur;
        hash = 19 * hash + Objects.hashCode(this.nomC);
        hash = 19 * hash + Objects.hashCode(this.dateNaissance);
        hash = 19 * hash + Objects.hashCode(this.rhesus);
        hash = 19 * hash + Objects.hashCode(this.groupSang);
        return hash;
    }
}
