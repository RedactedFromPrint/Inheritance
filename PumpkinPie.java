
/**
 * Write a description of class PumpkinPie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PumpkinPie extends Food
{
    public PumpkinPie(String name, int quantity){
        super(name, quantity);
        addHealth = 8;
    }

    public int getAddHealth(){
        return 8;
    }
}
