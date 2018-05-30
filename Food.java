
/**
 * Write a description of class Food here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Food extends Item
{
    int quantity;
    int addHealth;

    public Food(String name, int quantity){
        super(name);
        this.quantity = quantity;
    }
}
