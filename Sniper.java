

public class Sniper extends Shooter {
    

    public Sniper(){
       super(10, 10, 20, 104);
       
    }

    public String getInfo() {
        return String.format("Снайпер: жизнь - %.1f  скорость - %d  Атаки - %d, Стрелы - %d",
                this.hp, this.speed, this.damage, this.arrows);
    }

    

  

   

   
}
