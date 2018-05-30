
/**
 * Write a description of class Carrot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Carrot extends Food
{
    public Carrot(String name, int quantity){
        super(name, quantity);
        addHealth = 3;
    }

    public int getAddHealth(){
        return 3;
    }
}
