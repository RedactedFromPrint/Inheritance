
/**
 * Write a description of class BadGuy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BadGuy extends Enemy
{
    public BadGuy(String name)
    {
        super(name);
        health = 100;
    }
    
    public void attack(){
        Player.health -= 10;
        super.attack();
    }
}
