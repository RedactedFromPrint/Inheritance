
/**
 * Write a description of class WoodenAxe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WoodenAxe extends Weapons{
    public WoodenAxe(String name){
        super(name);
    }

    public int attack(){
        return 7;
    }
    
    public boolean parry(){
        int chance = (int)(Math.random() * 10);
        if (chance < 1){
            return true;
        }else{
            return false;
        }
    }
}
