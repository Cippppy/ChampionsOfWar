/**
 * Weapon is a subclass of Item that uses the interfaces equipable and removeable
 * 
 * @author Christian Cipolletta
 * @version 2/26/2023
 */
public class Weapon extends Item implements Equipable, Removable
{
    /**
     * Create a new piece of Weapon with a name, an effect on health, and other info about it
     * 
     * @param name The name of the weapon
     * @param effectOnHealth The effect the weapon has on HP
     * @param otherInfo Other info about the weapon
     */
    public Weapon (String name, int effectOnHealth, String otherInfo)
    {
            super(name, effectOnHealth, otherInfo);
    }
}