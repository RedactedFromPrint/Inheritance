
/**
 * Write a description of class Weapons here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Weapons extends Item implements WeaponInterface{
    int damage;
    
    public Weapons(int damage){
        this.damage = damage;
    }
}
