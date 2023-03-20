public class Peasant extends Unit {
    protected int products= 100;

    public Peasant(){
        super(10, 7, 10);
        
     }
 
     public String getInfo() {
         return String.format("Крестьянин: жизнь - %.1f  скорость - %d, продукты - %d",
                 this.hp, this.speed,   this.products);
     }
}
