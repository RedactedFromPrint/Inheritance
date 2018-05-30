
/**
 * Write a description of class Potato here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Potato extends Food
{
    public Potato(String name, int quantity){
        super(name, quantity);
        addHealth = 1;
    }

    public int getAddHealth(){
        return 1;
    }
}
