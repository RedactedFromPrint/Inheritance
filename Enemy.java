
/**
 * Write a description of class Enemy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Enemy extends Character
{
    public Enemy(String name){
        super(name);
    }
    
    public void attack(){
        if (Player.health <= 0){
            System.out.println("You died!");
        }
    }
}
