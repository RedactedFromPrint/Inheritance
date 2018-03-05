
/**
 * Write a description of class IronAxeWeapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IronAxeWeapon extends Weapons
{
    public IronAxeWeapon(int damage, int durability){
        super(damage, durability);
    }

    public int attack(){
        return 9;
    }
    
    public boolean parry(){
        int chance = (int)(Math.random() * 10);
        if (chance <= 4){
            return true;
        }else{
            return false;
        }
    }
}
