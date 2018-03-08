
/**
 * Write a description of class GoldAxe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GoldAxe extends Weapons
{
    public GoldAxe(int damage){
        super(damage);
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
