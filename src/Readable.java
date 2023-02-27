/**
 * Readable is an interface that makes an item able to be read
 * 
 * @author Christian Cipolletta
 * @version 2/26/2023
 */
public interface Readable 
{
    /**
     * Abstract method to be used by Letter and Spell classes
     * @param character The character to use the readable item on
     * @param item The item to be read
     */
    public void read(Character character, Item item);
}
