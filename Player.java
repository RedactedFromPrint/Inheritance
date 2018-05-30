
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player extends Character
{
    public Player(String name)
    {
        super(name);
    }

    public void lightAttack(){
        Enemy.health -= 15;
        if (Enemy.health <= 0){
            System.out.println("You killed the enemy!");
        }
    }
    
    public void heavyAttack(){
        Enemy.health -= 30;
        Player.health -= 10;
        if (Enemy.health <= 0){
            System.out.println("You killed the enemy!");
        }
        if (Player.health <= 0){
            System.out.println("You died!");
        }
    }
}
