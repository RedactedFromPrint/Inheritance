
/**
 * Write a description of class Chestplate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Chestplate extends Armor
{
    public Chestplate(String name){
        super(name);
        int chance = (int)(Math.random() * 2);
        if (chance == 1){
            blocked = true;
        } else{
            blocked = false;
        }
    }
}
