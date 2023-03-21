package Gaim2.Units;
public class Monk extends Unit {
    protected int medicines= 100;

    public Monk(){
        super(10, 3, 10);
        
     }
 
     public String getInfo() {
         return String.format("Монах: жизнь - %.1f  скорость - %d, лекарства - %d",
                 this.hp, this.speed,   this.medicines);
     }
}
