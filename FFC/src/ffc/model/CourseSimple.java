/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffc.model;

/**
 *
 * @author sunweichen
 */
public class CourseSimple extends Course{
    
    public double distanceCS;
    Etape etape;
    
    public CourseSimple(String nomCourse,Etape etape){
        super(nomCourse);
        this.etape=etape;
    }

    @Override
    public float getDistance() {
       return etape.getDistanceEtape();
    }
    
    
    
}
