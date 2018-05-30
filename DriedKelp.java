
/**
 * Write a description of class DriedKelp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DriedKelp extends Food
{
    public DriedKelp(String name, int quantity){
        super(name, quantity);
        addHealth = 1;
    }

    public int getAddHealth(){
        return 1;
    }
}
