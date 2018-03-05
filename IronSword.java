
/**
 * Write a description of class IronSword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IronSword extends Weapons{
    public IronSword(int damage, int durability){
        super(damage, durability);
    }

    public int attack(){
        return 6;
    }
    
    public boolean parry(){
        int chance = (int)(Math.random() * 10);
        if (chance <= 6){
            return true;
        }else{
            return false;
        }
    }
}
