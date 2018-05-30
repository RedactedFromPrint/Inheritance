
/**
 * Write a description of class Apple here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Apple extends Food
{
    public Apple(String name, int quantity){
        super(name, quantity);
        addHealth = 4;
    }

    public int getAddHealth(){
        return 4;
    }
}
