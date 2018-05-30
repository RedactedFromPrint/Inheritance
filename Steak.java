
/**
 * Write a description of class Steak here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Steak extends Food
{
    public Steak(String name, int quantity){
        super(name, quantity);
        addHealth = 8;
    }

    public int getAddHealth(){
        return 8;
    }
}
