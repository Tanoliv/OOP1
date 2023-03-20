

public class Unit {
    protected float hp;
    protected int speed;
    protected int damage;

    public Unit(float hp, int speed, int damage){
        this.hp= hp;
        this.speed= speed;
        this.damage= damage;
    }


    public float getHp(){
        return hp;
    }
    public int getSpeed(){
        return speed;
    }
    public int getDamage(){
        return damage;
    }

    
   

   
}
