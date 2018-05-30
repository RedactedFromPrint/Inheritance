
/**
 * Write a description of class Armor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Armor extends Item implements DefenseCommands
{
    String type;
    int chance;
    
    public Armor(String name, String type){
        super(name);
        this.type = type;
        if (type.equals("Leather")){
            chance = 3;
        }
        else if(type.equals("Gold")){
            chance = 5;
        }
        else if(type.equals("Chain")){
            chance = 5;
        }
        else if(type.equals("Iron")){
            chance = 6;
        }
        else{
            chance = 8;
        }
    }
    
    public boolean blocked(){
        int block = (int)(Math.random() * 10);
        if (block < chance){
            return true;
        } else{
            return false;
        }
    }
}
