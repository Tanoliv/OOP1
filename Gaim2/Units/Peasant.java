package Gaim2.Units;

public class Peasant extends Shooter {
    protected int products= 100;
    public Peasant() {
        super(10, 3, 5, 1);        
    }

    public String getInfo() {
        return String.format("Крестьянин: жизнь - %.1f  скорость - %d, Атаки - %d, Вилы - %d, продукты - %d",
                this.hp, this.speed, this.damage, this.arrows,   this.products);
    }

}
