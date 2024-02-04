Random rnd = new Random();
input input=new input(); //Typ Integer
int deinScore = 0;
int GegnerScore = 0;
while(deinScore < 3 && GegnerScore < 3) {
print(Gebe 1,2,3 ein, 1=Schere, 2=Stein, 3=Papier);
int deinmove=input.nextint//var lesen als eingabe 
Integer randomInt = rnd.getRandomInt(1,3);
int Gegnerschmove = randomInt; }

if (deinMove == 1) {  //If-Block, geht alle Optionen durch, wenn man selbst Schere wählt
    if(Gegnerschmove == 1) { 
     print("Unentschieden! Geht noch besser, nicht wahr?"); }
     if(Gegnerschmove ==2) {
         print("Niederlage! Enttäuschung sein Vater!);
         GegnerScore= GegnerScore + 1
         }  
    if(Gegnerschmove == 3) {
        print("Nur Glück, würde sogar mein 2-jähriger Cousin schaffen");
        DeinScore= DeinScore + 1
        } 
  } // Ende dieses If-Blocks
  if(deinmove==2){
      if(Gegnerschmove==1){
          print(Du hast gewonnen!! Stark man);
          Deinscore=Deinscore+1;
          }
            if(Gegnerschmove==2){
          print("Unentschieden! Geht noch besser, nicht wahr?") 
          }
           if(Gegnerschmove==3){
               print("Niederlage! Enttäuschung sein Vater!);
               Gegnerscore=Gegnerscore+1;
               } 
      
      }
      
      if(deinmove == 3) {
          if(Gegnerschmove == 1) {
          print("Niederlage! Enttäuschung sein Vater!);
               Gegnerscore=Gegnerscore+1; }
               
            if (Gegnerschmove == 2) {
                print(du hast gewonnen!! stark man);
          Deinscore=Deinscore+1;}
          
          if (Gegnerschmove == 3) {
              print("Unentschieden! Geht noch besser, nicht wahr?") }
          }
          }
          
          if (deinScore == 3) {print("du gewinnst yippi")}
          else {print("haha loser")}
