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

        Course course1=new Course("le tour france");
        
        Edition e1=new Edition("2020","01/08","10/10","termine");
        Edition e2=new Edition("2021","05/06","11/08","termine");
        Edition e3=new Edition("2022","09/09","31/10","encours");
        Edition e4=new Edition("2023","12/07","30/09","planifie");
        
        course1.enregistrerEdition(e1);
        course1.enregistrerEdition(e2);
        course1.enregistrerEdition(e3);
        course1.enregistrerEdition(e4);
        
        System.out.println(" "); 
        System.out.println("Toutes les edition de la course << "+course1.getNom()+" >> : "); 
        course1.afficherTout();

        Etape et1=new Etape(1,"termine",130.23f,"toulouse","france","pau","france",5,3);
        Etape et2=new Etape(2,"en cours",250.45f,"pau","france","bordeaux","france",3,5);
        Etape et3=new Etape(3,"pas commancer",178.81f,"boudeaux","france","royan","france",5,4);
        Etape et4=new Etape(4,"pas commencer",219.47f,"royan","france","la rochelle","france",2,5);
     
  
        e3.ajouterEtape(1, et1);
        e3.ajouterEtape(2, et2);
        e3.ajouterEtape(3, et3);
        e3.ajouterEtape(4, et4);
        
    System.out.println(" "); 
     Iterator<Etape> it;
     Collection<Etape> etapes;
     etapes =e3.obtenirEtapes();
     it = etapes.iterator();
     while(it.hasNext()) {
        it.next().afficherTout();
    }
     
     System.out.println(" "); 
     
     System.out.println("la distance : "+e3.getDistance()+" KM");
    
     Coureur c1=new Coureur(1,"sun weichen","15/11/1998","-","AB");
     Coureur c2=new Coureur(2,"zhibo xie","04/04/1998","+","B");
     Coureur c3=new Coureur(3,"abc def","23/12/2000","-","O");
     Coureur c4=new Coureur(4,"cecile white","08/01/2003","-","A");
     Coureur c5=new Coureur(5,"sylvia bro","11/08/1995","+","B");
     
     Equipe eq1 = new Equipe(1, "B&B", "Française", "LIFFOR", "0398746490", "eghegge@hjesh.com");
     
     InscriptionC IC1 =new InscriptionC(202201,"valide","03/02/2022","inscrit");
     InscriptionC IC2 =new InscriptionC(202202,"valide","14/03/2022","inscrit");
     InscriptionC IC3 =new InscriptionC(202203,"invalide","15/03/2022","refuse");
     InscriptionC IC4 =new InscriptionC(202204,"enattente","01/04/2022","enattente");
     InscriptionC IC5 =new InscriptionC(202205,"enattente","08/05/2022","enattente");

     e3.inscrireCoureur(c1, IC1);
     e3.inscrireCoureur(c2, IC2);
     e3.inscrireCoureur(c3, IC3);
     e3.inscrireCoureur(c4, IC4);
     e3.inscrireCoureur(c5, IC5);
     
     eq1.ajouterCoureurs(c1);
     eq1.ajouterCoureurs(c2);
     eq1.ajouterCoureurs(c3);
     eq1.ajouterCoureurs(c4);
     eq1.ajouterCoureurs(c5);
     
     InscriptionE IE1 =new InscriptionE(202201,"enattente","08/05/2022","enattente");

     e3.inscrireEquipe(eq1, IE1);
     
     TempsEtapeCoureur tc1=new TempsEtapeCoureur(2.34f);
     TempsEtapeCoureur tc2=new TempsEtapeCoureur(4.32f);
     TempsEtapeCoureur tc3=new TempsEtapeCoureur(1.02f);
     TempsEtapeCoureur tc4=new TempsEtapeCoureur(10.34f);
     TempsEtapeCoureur tc5=new TempsEtapeCoureur(7.56f);
     
     et1.enregistreTemps(c1, tc1);
     et1.enregistreTemps(c2, tc2);
     et1.enregistreTemps(c3, tc3);
     et1.enregistreTemps(c4, tc4);
     et1.enregistreTemps(c5, tc5);
     
     System.out.println(" "); 
     
     et1.etablirClassementCoureur();
     
     Sprint sp1=new Sprint(1);
     Sprint sp2=new Sprint(2);
     Sprint sp3=new Sprint(3);
     Sprint sp4=new Sprint(4);
     Sprint sp5=new Sprint(5);
     

     sp1.ajouterTsprint(1, c5);
     sp1.ajouterTsprint(2, c3);
     sp1.ajouterTsprint(3, c2);
     sp1.ajouterTsprint(4, c4);
     sp1.ajouterTsprint(5, c1);
     
     sp2.ajouterTsprint(1, c2);
     sp2.ajouterTsprint(2, c4);
     sp2.ajouterTsprint(3, c3);
     sp2.ajouterTsprint(4, c1);
     sp2.ajouterTsprint(5, c5);
     
     sp3.ajouterTsprint(1, c1);
     sp3.ajouterTsprint(2, c2);
     sp3.ajouterTsprint(3, c3);
     sp3.ajouterTsprint(4, c4);
     sp3.ajouterTsprint(5, c5);
     
     sp4.ajouterTsprint(1, c4);
     sp4.ajouterTsprint(2, c5);
     sp4.ajouterTsprint(3, c1);
     sp4.ajouterTsprint(4, c2);
     sp4.ajouterTsprint(5, c3);
     
     sp5.ajouterTsprint(1, c1);
     sp5.ajouterTsprint(2, c3);
     sp5.ajouterTsprint(3, c2);
     sp5.ajouterTsprint(4, c4);
     sp5.ajouterTsprint(5, c5); 
     
     et1.ajouterSprint(sp1);
     et1.ajouterSprint(sp2);
     et1.ajouterSprint(sp3);
     et1.ajouterSprint(sp4);
     et1.ajouterSprint(sp5);
     
     Col co1=new Col(1);
     Col co2=new Col(2);
     Col co3=new Col(3);

     co1.ajouterTcol(1, c5);
     co1.ajouterTcol(2, c4);
     co1.ajouterTcol(3, c1);
     co1.ajouterTcol(4, c3);
     co1.ajouterTcol(5, c2);
     
     co2.ajouterTcol(1, c5);
     co2.ajouterTcol(2, c2);
     co2.ajouterTcol(3, c4);
     co2.ajouterTcol(4, c1);
     co2.ajouterTcol(5, c3);
     
     co3.ajouterTcol(1, c3);
     co3.ajouterTcol(2, c1);
     co3.ajouterTcol(3, c4);
     co3.ajouterTcol(4, c5);
     co3.ajouterTcol(5, c2);

     et1.ajouterCol(co1);
     et1.ajouterCol(co2);
     et1.ajouterCol(co3);

     System.out.println(" "); 
     
     et1.getMeilleurSprinter();
     
     et1.getMeilleurCols();
     
     
    }
}

