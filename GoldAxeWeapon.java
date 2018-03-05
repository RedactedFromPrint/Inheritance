
/**
 * Write a description of class GoldAxeWeapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GoldAxeWeapon extends Weapons
{
    public GoldAxeWeapon(int damage, int durability){
        super(damage, durability);
    }

    public int attack(){
        return 7;
    }
    
    public boolean parry(){
        int chance = (int)(Math.random() * 10);
        if (chance <= 2){
            return true;
        }else{
            return false;
        }
    }
}
