
/**
 * Write a description of class StoneSword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StoneSword extends Weapons{
    public StoneSword(int damage, int durability){
        super(damage, durability);
    }

    public int attack(){
        return 5;
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
