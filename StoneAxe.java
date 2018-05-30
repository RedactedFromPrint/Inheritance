
/**
 * Write a description of class StoneAxe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StoneAxe extends Weapons{
    public StoneAxe(String name){
        super(name);
    }

    public int attack(){
        return 9;
    }
    
    public boolean parry(){
        int chance = (int)(Math.random() * 10);
        if (chance < 3){
            return true;
        }else{
            return false;
        }
    }
}
