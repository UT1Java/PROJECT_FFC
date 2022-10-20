/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffc.model;

import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author sunweichen
 */
public class Col {
    
    public int numCol;
      private HashMap<Coureur,PointsCol> TableCol=new HashMap<>();
      
      public Col(int col){
        this.numCol=col;
        this.TableCol=new HashMap<Coureur,PointsCol>();
        
    }
      public int getnumSprint(){
      return this.numCol;
      }
              
     public void ajouterTcol(int ordre,Coureur c){
        switch (ordre) {
            case 1:
                this.TableCol.put(c,new PointsCol(ordre,5));
                break;
            case 2:
                this.TableCol.put(c,new PointsCol(ordre,3));
                break;
            case 3:
                this.TableCol.put(c,new PointsCol(ordre,2));
                break;
            default:
                this.TableCol.put(c,new PointsCol(ordre,1));
                break;
        }
    }
}

