
/**
 * Write a description of class BeetrootSoup here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BeetrootSoup extends Food
{
    public BeetrootSoup(String name, int quantity){
        super(name, quantity);
        addHealth = 6;
    }

    public int getAddHealth(){
        return 6;
    }
}
