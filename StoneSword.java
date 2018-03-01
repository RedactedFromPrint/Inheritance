
/**
 * Write a description of class StoneSword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StoneSword extends Weapons
{
    public StoneSword(int damage, int durability){
        super(damage, durability);
    }

    public int attack(){
        return 4;
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
