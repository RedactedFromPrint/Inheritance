
/**
 * Write a description of class DiamondAxe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DiamondAxe extends Weapons{
    public DiamondAxe(String name){
        super(name);
    }

    public int attack(){
        return 9;
    }
    
    public boolean parry(){
        int chance = (int)(Math.random() * 10);
        if (chance < 5){
            return true;
        }else{
            return false;
        }
    }
}
