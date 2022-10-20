/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffc.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author sunweichen
 */
public class Sprint {
    public int numSprint;
    public Hashtable<Coureur,PointsSprint> TableSprint;
 
    
    public Sprint(int ns){
        this.numSprint=ns;
        this.TableSprint=new Hashtable<Coureur,PointsSprint>();
    }
    
    public int getNum(){
    return this.numSprint;
    }
    
    public void ajouterTsprint(int ordre,Coureur c){
   
        
        switch (ordre) {
            case 1:
                this.TableSprint.put(c,new PointsSprint(ordre,5));
                break;
            case 2:
                this.TableSprint.put(c,new PointsSprint(ordre,3));
                break;
            case 3:
                this.TableSprint.put(c,new PointsSprint(ordre,2));
                break;
            default:
                this.TableSprint.put(c,new PointsSprint(ordre,1));
                break;
        }
    }
    
    
    
    public void AfficherClassementSprint(){
        System.out.println("Classement Sprinteur Par Sprint "+this.numSprint);
        
        ArrayList<Map.Entry<Coureur,PointsSprint>>list =new ArrayList<>(TableSprint.entrySet());

            Collections.sort(list, new Comparator<Map.Entry<Coureur,PointsSprint>>() {
            @Override             
            public int compare(Map.Entry<Coureur,PointsSprint> o1, Map.Entry<Coureur,PointsSprint> o2) {
            if(o1.getValue().getOrdre()>o2.getValue().getOrdre()){return 1;}
            else if (o1.getValue().getOrdre()<o2.getValue().getOrdre()){return -1;}
            else {return 0;}
                }    
            });
            
            Iterator<Map.Entry<Coureur,PointsSprint>> iter=list.iterator();
            while(iter.hasNext()){
                Map.Entry<Coureur,PointsSprint> item=iter.next();
                String nom=item.getKey().getNomC();
              
                int classement=item.getValue().getOrdre();
                int point=item.getValue().getPointS(); 
                System.out.println(classement+" "+nom+" "+point);
            }

                }
        
                    
           
            
    
        }
