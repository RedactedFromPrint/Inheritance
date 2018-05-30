
/**
 * Write a description of class Cookie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cookie extends Food
{
    public Cookie(String name, int quantity){
        super(name, quantity);
        addHealth = 2;
    }

    public int getAddHealth(){
        return 2;
    }
}
