

public class Magician extends Unit {
    protected int mana= 100;

    public Magician(){
        super(10, 3, 10);
        
     }
 
     public String getInfo() {
         return String.format("Маг: жизнь - %.1f  скорость - %d, Мана - %d",
                 this.hp, this.speed,   this.mana);
     }
}
