
/**
 * Write a description of class IronAxe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IronAxe extends Weapons
{
    public IronAxe(int damage){
        super(damage);
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
