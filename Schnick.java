import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;
public class Schnick {
    public static void main(String[] args) {

int deinScore = 0;
int GegnerScore = 0;

while(deinScore  < 3 && GegnerScore < 3) {

final Integer rnd= ThreadLocalRandom.current().nextInt(1, 3 + 1);
String input= JOptionPane.showInputDialog("Gebe 1,2 oder 3 ein 1=Schere, 2=Stein, 3=Papier"); 
Integer deinMove= Integer.parseInt(input);
Integer Gegnerschmove= rnd; 

if (deinMove == 1) {  //If-Block, geht alle Optionen durch, wenn man selbst Schere wählt
    if(Gegnerschmove==1) { 
     System.out.println("Unentschieden! Geht noch besser, nicht wahr?"); }
     if(Gegnerschmove==2) {
         System.out.println("Niederlage! Knapp daneben ist auch vorbei...");
         GegnerScore= GegnerScore+1;
         }  
    if(Gegnerschmove==3) {
        System.out.println("Na gut... Du gewinnst");
        deinScore= deinScore+1;
        } 
  } // Ende dieses If-Blocks

  if(deinMove==2){
         if(Gegnerschmove==1) { 
     System.out.println("Na gut... Du gewinnst");
           deinScore= deinScore+1; }
     if(Gegnerschmove==2) {
          System.out.println("Unentschieden! Geht noch besser, nicht wahr?");
         }  
    if(Gegnerschmove==3) {
        System.out.println("Niederlage! Knapp daneben ist auch vorbei...");
        GegnerScore= GegnerScore+1;
        } 
      } // Ende dieses If-Blocks

      
      if(deinMove == 3) {
        if(Gegnerschmove==1) { 
     System.out.println("Niederlage! Knapp daneben ist auch vorbei...");
           GegnerScore= GegnerScore+1; }
     if(Gegnerschmove==2) {
          System.out.println("Na gut... Du gewinnst");
          deinScore= deinScore+1;
         }  
    if(Gegnerschmove==3) {
        System.out.println(("Unentschieden! Geht noch besser, nicht wahr?"));
        
        }         
} // Ende dieses If-Blocks

if(deinMove==4) {
    System.out.println("Du kennst den allmächtigen Brunnen! Sofortiger Sieg!");
}

}// Ende der While-Schleife
if (deinScore == 3) {
   System.out.println("Du hast diese Runde Schnick-Schnack-Schnuck gewonnen! Gratulation!"); 
} 
   else {
    System.out.println("Hat leider nicht zum Sieg gereicht! Da fehlt es jemandem an Übung...");
   }
} // Ende der Main-Methode

    
}  // Ende der Klasse
