
/**
 * Write a description of class BaddestGuy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BaddestGuy extends Enemy
{
    public BaddestGuy(String name)
    {
        super(name);
        health = 200;
    }
    
    public void attack(){
        Player.health -= 50;
        super.attack();
    }
}
