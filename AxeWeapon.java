
/**
 * Write a description of class AxeWeapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AxeWeapon extends Weapons
{
    public AxeWeapon(int damage, int durability){
        super(damage, durability);
    }

    public int attack(){
        if (type == "Wooden"){
            return 4;
        }
        else if (type == "Gold"){
            return 4;
        }
        else if (type == "Stone"){
            return 5;
        }
        else if (type == "Iron"){
            return 6;
        }
        else {
            return 7;
        }
        durability -= 1;
        if (durability == 0){
            .remove
        }
    }
    
    public boolean parry(){
        
    }
}
