
/**
 * Write a description of class RabbitStew here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RabbitStew extends Food
{
    public RabbitStew(String name, int quantity){
        super(name, quantity);
        addHealth = 10;
    }

    public int getAddHealth(){
        return 10;
    }
}
