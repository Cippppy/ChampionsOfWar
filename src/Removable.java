/**
 * Removes is an interface that removes an item from a character
 * 
 * @author Christian Cipolletta
 * @version 2/26/2023
 */
public interface Removable 
{
    /**
     * Default method that takes a character and an item to remove from that character
     * @param character The character to remove an item from
     * @param item The item to remove from the character
     */
    public default void remove(Character character, Item item)
    {
        if(character != null && item != null)
        {
                System.out.println("removing");
        }
        else
        {
            System.out.println("Error: The input is invalid.");
        }
    }
}
