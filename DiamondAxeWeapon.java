
/**
 * Write a description of class DiamondAxeWeapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DiamondAxeWeapon extends Weapons
{
    public DiamondAxeWeapon(int damage, int durability){
        super(damage, durability);
    }

    public int attack(){
        return 9;
    }
    
    public boolean parry(){
        int chance = (int)(Math.random() * 10);
        if (chance <= 5){
            return true;
        }else{
            return false;
        }
    }
}
