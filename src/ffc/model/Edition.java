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
public class Edition {
    public String dateDebut;
    public String dateFin;
    public String annee;
    public String etatEdition;
     public float distanceCE=0f;
    public ArrayList<Equipe>equipes=new ArrayList<>();
    public ArrayList<Coureur>coureurs=new ArrayList<>();
    public HashMap<OrdreEtape,Etape> tableEtape=new HashMap<>();
    public HashMap<Coureur,InscriptionC> coureurInscription=new HashMap<>();
    public HashMap<Equipe,InscriptionE> equipeInscription=new HashMap<>();
    
    public Edition(String annee, String dateDebut, String dateFin, String etatEdition){
        this.annee=annee;
        this.dateDebut=dateDebut;
        this.dateFin=dateFin;
        this.etatEdition=etatEdition;
    }
    
    public void afficherTout(){
        System.out.println("Annee : "+annee+" Date Debut: "+dateDebut+" Date Fin : "+dateFin+" Etat : "+etatEdition);
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
     
    public void inscrireCoureur(Coureur c,InscriptionC IC) {
	coureurInscription.put(c, IC);
    }
    
    public void supprimerCoureur(Coureur c) {
	coureurInscription.remove(c);
    }
    
    public void inscrireEquipe(Equipe e,InscriptionE IE){
        equipeInscription.put(e, IE);
    }
    
    public void supprimerEquipe(Equipe e) {
	equipeInscription.remove(e);
    }

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

    public void modifEtatEdition(String etat){
        this.etatEdition=etat;
    }
    
    public void etablirClassementGeneralPtCoureur(Etape e){
        
        ArrayList<OrdreEtape>etapesr=new ArrayList<>();
        
        Collection<OrdreEtape> Etapes;
        Etapes=this.tableEtape.keySet();
        
        Iterator<OrdreEtape>it;
        it= Etapes.iterator();
        
         while(it.hasNext()){
            etapesr.add(it.next());
        }
         
         
         
         
        
        HashMap<Coureur, Float> coureurEdition=new HashMap<>();
        
        float temps=0f;
        
       
        
        
        
        
        
        
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
    
    public void etablirClassementDefinitifEquipe(){}
           
}

