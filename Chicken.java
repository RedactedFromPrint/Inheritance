
/**
 * Write a description of class Chicken here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Chicken extends Food
{
    public Chicken(String name, int quantity){
        super(name, quantity);
        addHealth = 4;
    }

    public int getAddHealth(){
        return 4;
    }
}
