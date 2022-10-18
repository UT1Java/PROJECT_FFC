/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ffc.model;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author sunweichen
 */
public class FFC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
            
        Etape et1=new Etape("termine",130f,"toulouse","france","pau","france");
        Etape et2=new Etape("en cours",250f,"pau","france","bordeaux","france");
     
       
        CourseSimple cs1=new CourseSimple("le tour france",et1);
        
        Edition e1=new Edition("2022","01/08","10/10","termine");
        Edition e2=new Edition("2023","12/07","30/09","planifie");
        
        cs1.enregistrerEdition(e1);
        cs1.enregistrerEdition(e2);
        
        cs1.afficherNom();
        cs1.afficherTout();
        
        CourseEtape ce1=new CourseEtape("course etape 1");
        
  
        ce1.ajouterEtape(1, et1);
        ce1.ajouterEtape(2, et2);
        
        
     Iterator<Etape> it;
     Collection<Etape> etapes;
     etapes =ce1.obtenirEtapes();
     it = etapes.iterator();
     while(it.hasNext()) {
        it.next().afficherTout();
    }
     
     System.out.println(cs1.getDistance());
     System.out.println(ce1.getDistance());
    
    }
    
}
