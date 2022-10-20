/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffc.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author sunweichen
 */
public class Etape {
    public int id;
    public String etatEtape;
    public float distanceEtape;
    public String villeDepart;
    public String villeArrivee;
    public String paysDepart;
    public String paysArrivee;
    public int NombreSprintMax;
    public int NombreColMax;
    
    public ArrayList<Sprint>sprints=new ArrayList<>();
    public ArrayList<Col>cols=new ArrayList<>();
    public HashMap<Coureur, TempsEtapeCoureur>coureurEtape=new HashMap<>();
    
    
    public Etape(int id,
            String etatEtape, 
            float distanceEtape,
            String villeDepart,
            String paysDepart,
            String villeArrivee,
            String paysArrivee,
            int NombreSprintMax,
            int NombreColMax){
        
        this.id=id;
        this.distanceEtape=distanceEtape;
        this.etatEtape=etatEtape;
        this.paysArrivee=paysArrivee;
        this.villeDepart=villeDepart;
        this.paysDepart=paysDepart;
        this.villeArrivee=villeArrivee;
        this.NombreSprintMax=NombreSprintMax;
        this.NombreColMax=NombreColMax;
    }
    
    public float getDistanceEtape(){
        return this.distanceEtape;
    }
    
    public void afficherTout(){
        System.out.println(id+" "+etatEtape+" "+distanceEtape+" "+villeDepart+" "+paysDepart+" "+villeArrivee+" "+paysArrivee);
    }
    
    public void ajouterSprint(Sprint s){
        sprints.add(s);
    }
   
    public void ajouterCol(Col c){
        cols.add(c);
    }
    
    public void enregistreTemps(Coureur c,TempsEtapeCoureur t){
        coureurEtape.put(c, t);
    }
    
    public void etablirClassementCoureur(){
        
    ArrayList<Map.Entry<Coureur,TempsEtapeCoureur>> list=new ArrayList<>(coureurEtape.entrySet());
    
    Collections.sort(list, new Comparator<Map.Entry<Coureur,TempsEtapeCoureur>>(){
     
        @Override
        public int compare(Map.Entry<Coureur, TempsEtapeCoureur> o1, Map.Entry<Coureur, TempsEtapeCoureur> o2) {
             if(o1.getValue().getTempsEtape()>o2.getValue().getTempsEtape()) {return 1;}
                else if(o1.getValue().getTempsEtape()<o2.getValue().getTempsEtape()){return -1;}
                else {return 0;}
            }
        });
    
    Iterator<Map.Entry<Coureur,TempsEtapeCoureur>> iter=list.iterator();
    
    while(iter.hasNext()) {
        Map.Entry<Coureur,TempsEtapeCoureur> item =iter.next();
        String key=item.getKey().getNomC();
        float value=item.getValue().getTempsEtape();
        System.out.println(key+" "+value);
    
    }
    
}
 
    public void etablirclassementEquipe(){
    
    
    }

    public void getMeilleurSprinter(){
        
        ArrayList<Coureur>coureur=new ArrayList<>();
        
        Collection<Coureur> coureurs;
        coureurs=this.coureurEtape.keySet();
        
        Iterator<Coureur>it;
        it=coureurs.iterator();
        
        
        int meilleurpoint=0;
        String meilleurSprinteur="";
        int pointSprint=0;
        
        while(it.hasNext()){
            coureur.add(it.next());
        }

         for(int i=0;i<coureur.size();i++){
             int pointSprintTotal=0;
            for(int j=0;j<sprints.size();j++){
            if(this.sprints.get(j).getNum()==this.NombreSprintMax){
                    pointSprint=2*this.sprints.get(j).TableSprint.get(coureur.get(i)).getPointS();
                }else{
                    pointSprint=this.sprints.get(j).TableSprint.get(coureur.get(i)).getPointS();
                }
                    pointSprintTotal = pointSprint+ pointSprintTotal;    
              }
            
            if(pointSprintTotal>meilleurpoint) {
                  meilleurpoint=pointSprintTotal;
                  meilleurSprinteur=coureur.get(i).getNomC();                 
           }
        
         }
          System.out.println("Le meilleur sprinteur : "+meilleurSprinteur+" avec son point : "+meilleurpoint);
}
    
    
    public void getMeilleurCols(){
        ArrayList<Coureur>coureur=new ArrayList<>();
        
        Collection<Coureur> coureurs;
        coureurs=this.coureurEtape.keySet();
        
        Iterator<Coureur>it;
        it=coureurs.iterator();
        
        
        int meilleurpoint=0;
        String meilleurGrimpeur="";
        int pointCol=0;
        
        while(it.hasNext()){
            coureur.add(it.next());
        }

         for(int i=0;i<coureur.size();i++){
            int pointColTotal=0;
            for(int j=0;j<cols.size();j++){
            if(this.cols.get(j).getnumSprint()==this.NombreColMax){
                    pointCol=2*this.sprints.get(j).TableSprint.get(coureur.get(i)).getPointS();
                }else{
                    pointCol=this.sprints.get(j).TableSprint.get(coureur.get(i)).getPointS();
                }
                    pointColTotal = pointCol+ pointColTotal;   
              }
            
            if(pointColTotal>meilleurpoint) {
                  meilleurpoint=pointColTotal;
                  meilleurGrimpeur=coureur.get(i).getNomC();                 
           }
        
         }
          System.out.println("Le meilleur grimpeur : "+meilleurGrimpeur+" avec son point : "+meilleurpoint);
    }
    
    
    
}
