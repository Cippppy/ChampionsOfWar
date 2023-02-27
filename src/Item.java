import java.util.function.BiConsumer;

/**
 * Item is a super class that has the categories, armor, spell, letter, and weapon.
 * It is used to fill the character's bag and can be used on any character.
 * 
 * @author Christian Cipolletta
 * @version 2/26/2023
 */
public class Item 
{
    // The name of the item
    private String itemName;
    // The effect the item has on HP
    private int effectOnHealth;
    // Other info about the item
    private String otherInfo;

    /**
     * Creates a new item with an intial name, effect on health, and other info.
     * 
     * @param itemName The name of the item
     * @param effectOnHealth The effect the item has on HP
     * @param otherInfo Other info about the item
     */
    public Item(String itemName, int effectOnHealth, String otherInfo)
    {
        if(itemName != null && otherInfo != null)
        {
            this.itemName = itemName;
            this.effectOnHealth = effectOnHealth;
            this.otherInfo = otherInfo;
        }
        else
        {
            System.out.println("The input is invalid.");
        }
    }

    /**
     * Set the name of the item
     * @param itemName The name of the item
     */
    public void setItemName(String itemName) 
    {
        if(itemName != null)
        {
        this.itemName = itemName;
        }
        else
        {
            System.out.println("The input is invalid.");
        }
    }

    /**
     * Return the name of the item
     * @return The name of the item
     */
    public String getItemName() 
    {
        return this.itemName;
    }

    /**
     * Set the item's effect on HP
     * @param effectOnHealth The item's effect on HP
     */
    public void setEffectOnHealth(int effectOnHealth) 
    {
        this.effectOnHealth = effectOnHealth;
    }

    /**
     * Return the item's effect on HP
     * @return The item's effect on HP
     */
    public int getEffectOnHealth() 
    {
        return this.effectOnHealth;
    }

    /**
     * Set the item's other info
     * @param otherInfo The item's other info
     */
    public void setOtherInfo(String otherInfo)
    {
        if(otherInfo != null)
        {
            this.otherInfo = otherInfo;
        }
        else
        {
            System.out.println("Error: The input is invalid.");
        }
    }

    /**
     * Return the item's other info
     * @return The item's other info
     */
    public String getOtherInfo()
    {
        return otherInfo;
    }

    /**
     * Use the choosen item on a specific character
     * @param character The character the item is to be used on
     * @param item The item that is to be used
     */
    public void use(Character character, Item item)
    {
        if(character != null && item != null)
        {
            BiConsumer<Character, Item> use = (charName, itemName) -> 
            {
                charName.setHealthPoints(charName.getHealthPoints() + itemName.getEffectOnHealth());
                System.out.println(itemName.getItemName() + " used on " + charName.toString());
            };
            use.accept(character, item);
        }
        else
        {
            System.out.println("Error: The input is invalid.");
        }
    }
}