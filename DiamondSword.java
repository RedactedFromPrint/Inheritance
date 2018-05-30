
/**
 * Write a description of class DiamondSword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DiamondSword extends Weapons{
    public DiamondSword(String name){
        super(name);
    }

    public int attack(){
        return 7;
    }
    
    public boolean parry(){
        int chance = (int)(Math.random() * 10);
        if (chance < 7){
            return true;
        }else{
            return false;
        }
    }
}
