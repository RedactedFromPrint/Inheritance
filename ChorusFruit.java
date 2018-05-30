
/**
 * Write a description of class ChorusFruit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChorusFruit extends Food
{
    public ChorusFruit(String name, int quantity){
        super(name, quantity);
        addHealth = 4;
    }

    public int getAddHealth(){
        return 4;
    }
}
