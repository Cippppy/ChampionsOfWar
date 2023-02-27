/**
 * Armor is a subclass of Item that uses the interfaces equipable and removeable
 * 
 * @author Christian Cipolletta
 * @version 2/26/2023
 */
public class Armor extends Item implements Equipable, Removable
{
    /**
     * Create a new piece of Armor with a name, an effect on health, and other info about it
     * 
     * @param name The name of the piece of armor
     * @param effectOnHealth The effect the piece of armor has on HP
     * @param otherInfo Other info about the piece of armor
     */
    public Armor(String name, int effectOnHealth, String otherInfo)
    {
            super(name, effectOnHealth, otherInfo);
    }

    @Override
    public void use(Character character, Item item)
    {
        super.use(character, item);
        equip(character, item);
    }
}

