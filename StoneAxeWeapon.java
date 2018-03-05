
/**
 * Write a description of class StoneAxeWeapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StoneAxeWeapon extends Weapons
{
    public StoneAxeWeapon(int damage, int durability){
        super(damage, durability);
    }

    public int attack(){
        return 9;
    }
    
    public boolean parry(){
        int chance = (int)(Math.random() * 10);
        if (chance <= 3){
            return true;
        }else{
            return false;
        }
    }
}
