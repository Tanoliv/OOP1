package Gaim2.Units;
public class Pikeman extends Shooter {
    
    protected int pike= 1;

    public Pikeman(){
        super(10, 7, 10, 0);
        
     }
 
     public String getInfo() {
         return String.format("Копейщик: жизнь - %.1f  скорость - %d  Атаки - %d,  Пика - %d",
                 this.hp, this.speed, this.damage,  this.pike);
     }
 
}
