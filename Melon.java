
/**
 * Write a description of class Melon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Melon extends Food
{
    public Melon(String name, int quantity){
        super(name, quantity);
        addHealth = 2;
    }

    public int getAddHealth(){
        return 2;
    }
}
