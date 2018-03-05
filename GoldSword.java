
/**
 * Write a description of class GoldSword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GoldSword extends Weapons{
    public GoldSword(int damage, int durability){
        super(damage, durability);
    }

    public int attack(){
        return 4;
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
