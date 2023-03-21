package Gaim2;
import Gaim2.Units.Crossbowman;
import Gaim2.Units.Magician;
import Gaim2.Units.Monk;
import Gaim2.Units.Outlaw;
import Gaim2.Units.Peasant;
import Gaim2.Units.Pikeman;
import Gaim2.Units.Sniper;
import Gaim2.Units.Sniper2;


public class program {  

  
    public static void main(String[] args) {    
        Sniper sniper = new Sniper();       
        Crossbowman crossbowman = new Crossbowman();       
        Pikeman pikeman = new Pikeman();
        Outlaw outlaw = new Outlaw();
        Peasant peasant = new Peasant();
        Monk monk = new Monk();
        Magician magician = new Magician();
        Sniper2 sniper2 = new Sniper2();

        System.out.println(sniper.getInfo());
        System.out.println(crossbowman.getInfo());
        System.out.println(pikeman.getInfo());
        System.out.println(outlaw.getInfo());
        System.out.println(peasant.getInfo());
        System.out.println(monk.getInfo());
        System.out.println(magician.getInfo());
        System.out.println(sniper2.getInfo());
    }

   
}
