
/**
 * Write a description of class MushroomStew here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MushroomStew extends Food
{
    public MushroomStew(String name, int quantity){
        super(name, quantity);
        addHealth = 6;
    }

    public int getAddHealth(){
        return 6;
    }
}
