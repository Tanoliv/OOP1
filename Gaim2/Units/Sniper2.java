package Gaim2.Units;

public class Sniper2 extends Shooter {

    public Sniper2() {
        super(10, 10, 20, 100);        
    }

    public String getInfo() {
        return String.format("Снайпер Вася: жизнь - %.1f  скорость - %d  Атаки - %d, Стрелы - %d",
                this.hp, this.speed, this.damage, this.arrows);
    }
}
