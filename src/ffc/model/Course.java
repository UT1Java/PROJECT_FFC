/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffc.model;

import java.util.ArrayList;

/**
 *
 * @author sunweichen
 */
public class Course {
    public String nomCourse;
    public int nbEdition;
    public ArrayList<Edition>editions=new ArrayList<>();
            
    public Course(String nomCourse){
        this.nomCourse=nomCourse;    
    }
    
    public void enregistrerEdition(Edition e){
        editions.add(e);
    }
    
    public void supprimerEdition(Edition e){
        for(int i=0;i<editions.size();i++){
            if(editions.get(i)==e){
                editions.remove(1);
            }
        }
    }
    
    public String getNom(){
       return nomCourse;
    }
    
    public void afficherTout(){
        for(int i=0;i<editions.size();i++){
            editions.get(i).afficherTout();
        }
    }
    
    
    
}
