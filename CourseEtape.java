/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffc.model;

import java.util.HashMap;

/**
 *
 * @author sunweichen
 */
public class CourseEtape extends Course{
    
    public HashMap<OrdreEtape,Etape> tableEtape;
    
    public double distanceCE;
    
    public CourseEtape(String nomCourse){
        super(nomCourse);
    }
    
    public void ajouterEtape(int numEtape,Etape e) {
        OrdreEtape o=new OrdreEtape(numEtape);
	tableEtape.put(o, e);
    }
    
     public void supprimerEtape(int numEtape) {
        OrdreEtape o=new OrdreEtape(numEtape);
	tableEtape.remove(o);
    }
    
}
