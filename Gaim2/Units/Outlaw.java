package Gaim2.Units;
public class Outlaw extends Shooter {
    protected int blockhead= 1;
    protected int knife= 1;

    public Outlaw(){
        super(10, 7, 10, 0);
        
     }
 
     public String getInfo() {
         return String.format("Разбойник: жизнь - %.1f  скорость - %d  Атаки - %d,  Дубина - %d, Нож - %d",
                 this.hp, this.speed, this.damage,  this.blockhead, this.knife);
     }
}
