
/**
 * Write a description of class WoodenSword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class WoodenSword extends Weapons{
    public WoodenSword(int damage){
        super(damage);
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
