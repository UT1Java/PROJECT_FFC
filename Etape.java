/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffc;

import ffc.Col;
import java.util.ArrayList;

/**
 *
 * @author sunweichen
 */
public class Etape {
    public String etatEtape;
    public double distanceEtape;
    public String villeDepart;
    public String villeArrivee;
    public String paysDepart;
    public String paysArrivee;
    public ArrayList<Sprint>sprints=new ArrayList<Sprint>();
    public ArrayList<Col>cols=new ArrayList <Col>();
    
    public Etape(String etatEtape, double distanceEtape,
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
    
    
           
}
