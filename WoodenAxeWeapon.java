
/**
 * Write a description of class WoodenAxeWeapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WoodenAxeWeapon extends Weapons
{
    public WoodenAxeWeapon(int damage, int durability){
        super(damage, durability);
    }

    public int attack(){
        return 7;
    }
    
    public boolean parry(){
        int chance = (int)(Math.random() * 10);
        if (chance <= 1){
            return true;
        }else{
            return false;
        }
    }
}
