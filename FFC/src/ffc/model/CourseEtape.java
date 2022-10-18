/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffc.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
/**
 *
 * @author sunweichen
 */
public class CourseEtape extends Course{
    
    public HashMap<OrdreEtape,Etape> tableEtape=new HashMap<>();
    
    public float distanceCE=0f;
    
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
     
     public Collection<Etape> obtenirEtapes(){
        return this.tableEtape.values();
     }

    @Override
    public float getDistance() {
     
     Collection<Etape> etapes;
     etapes =this.tableEtape.values();
     
     Iterator<Etape> it;
     it = etapes.iterator();
     
     while(it.hasNext()) {
        distanceCE=distanceCE+it.next().getDistanceEtape();
     }
    
   return distanceCE;
    
    }
     


     
     
    
}
