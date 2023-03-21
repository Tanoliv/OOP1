package Gaim2.Units;

public class Magician extends Unit { 
    protected int mana= 100;    
    
    public Magician(){
        super(50, 6, 8);
    }

    public String getInfo() {
        return String.format("Маг: жизнь - %.1f  скорость - %d, Мана - %d",
                this.hp, this.speed,   this.mana);
    }

}
