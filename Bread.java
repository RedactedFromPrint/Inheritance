
/**
 * Write a description of class Bread here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bread extends Food
{
    public Bread(String name, int quantity){
        super(name, quantity);
        addHealth = 5;
    }

    public int getAddHealth(){
        return 5;
    }
}
