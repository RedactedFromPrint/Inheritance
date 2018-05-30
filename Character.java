
/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Character
{
    public static int health;
    String name;
    
    public Character(String name){
        this.name = name;
    }
    
    public int getHealth(){
        return health;
    }
}
