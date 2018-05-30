
/**
 * Write a description of class BadderGuy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BadderGuy extends Enemy
{
    public BadderGuy(String name)
    {
        super(name);
        health = 150;
    }
    
    public void attack(){
        Player.health -= 25;
        super.attack();
    }
}
