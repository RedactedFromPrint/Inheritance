
/**
 * Write a description of class Weapons here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Weapons extends Item implements WeaponInterface{
    int damage;
    int durability;
    
    public Weapons(int damage, int durability, String type){
        this.damage = damage;
        this.durability = durability;
        this.type = type;
    }

    public void sampleMethod(){
        
    }
}
