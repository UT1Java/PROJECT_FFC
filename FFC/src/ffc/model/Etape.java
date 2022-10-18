/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffc.model;

import ffc.model.Sprint;
import java.util.ArrayList;

/**
 *
 * @author sunweichen
 */
public class Etape {
    public String etatEtape;
    public float distanceEtape;
    public String villeDepart;
    public String villeArrivee;
    public String paysDepart;
    public String paysArrivee;
    
    public Etape(String etatEtape, float distanceEtape,
            String villeDepart,
            String paysDepart,
            String villeArrivee,
            String paysArrivee){
        this.distanceEtape=distanceEtape;
        this.etatEtape=etatEtape;
        this.paysArrivee=paysArrivee;
        this.villeDepart=villeDepart;
        this.paysDepart=paysDepart;
        this.villeArrivee=villeArrivee;
    }
    
    public float getDistanceEtape(){
        return this.distanceEtape;
    }
    
    public void afficherTout(){
        System.out.println(etatEtape+" "+distanceEtape+" "+villeDepart+" "+paysDepart+" "+villeArrivee+" "+paysArrivee);
    
    }
    
    
           
}
