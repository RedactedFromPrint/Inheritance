
/**
 * Write a description of class Beetroot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Beetroot extends Food
{
    public Beetroot(String name, int quantity){
        super(name, quantity);
        addHealth = 1;
    }

    public int getAddHealth(){
        return 1;
    }
}
