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
    
        
     //Test de la classe Equipe / Coureur et les différentes inscriptions
        
    //Création des coureurs
     Coureur coureur1 = new Coureur(1, "Laffont", "Jovin", "06/07/2000", "négatif", "AB");
     Coureur coureur2 = new Coureur(2, "Dupont", "Elina", "04/09/2001", "négatif", "A");
     Coureur coureur3 = new Coureur(3, "lafontaine", "valsin", "08/03/1999", "positif", "A");
     Coureur coureur4 = new Coureur(4, "Xavier", "victor", "05/07/2002", "négatif", "AB");
     Coureur coureur5 = new Coureur(5, "Vacquer", "alex", "08/10/2000", "négatif", "B");
     
     //Création des équipes
     Equipe equipe1 = new Equipe(1, "B&B", "Française", "LIFFOR", "0398746490", "eghegge@hjesh.com");
     
     //ajouter un coureur a une équipe
     equipe1.ajouterCoureurs(coureur1);
     equipe1.ajouterCoureurs(coureur2);
     equipe1.ajouterCoureurs(coureur3);
     equipe1.ajouterCoureurs(coureur4);
     equipe1.ajouterCoureurs(coureur5);
     //Visualiser les coureurs d'une équipe
     equipe1.obtenirTousLesCoureurs();
     
     //Création d'un véhicule d'assistance
     VehiculesAssistances vehicule1 = new VehiculesAssistances(123984, "TOYOTA", "CV");
     VehiculesAssistances vehicule2 = new VehiculesAssistances(123479, "CITROEN", "TV");
     VehiculesAssistances vehicule3 = new VehiculesAssistances(149384, "MERCEDES", "IV");
    }
    
}
