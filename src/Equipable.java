/**
 * Equipable is an interface that equips an item onto a character
 * 
 * @author Christian Cipolletta
 * @version 2/26/2023
 */
public interface Equipable
{
    /**
     * Default method that takes a character and an item to equip to that character
     * @param character The character to equip an item onto
     * @param item The item to equip onto the character
     */
    public default void equip(Character character, Item item)
    {
        if(character != null && item != null)
        {
            System.out.println("equipping");
        }
        else
        {
            System.out.println("Error: The input is invalid.");
        }
    }
}