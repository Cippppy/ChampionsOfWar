import java.util.function.BiConsumer;

public class Item 
{
    // The name of the item
    private String itemName;
    // The effect the item has on HP
    private int effectOnHealth;

    public Item(String itemName, int effectOnHealth)
    {
        if(itemName != null)
        {
            this.itemName = itemName;
            this.effectOnHealth = effectOnHealth;
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

    public void use(Character character, Item item)
    {
        if(character != null && item != null)
        {
            BiConsumer<Character, Item> use = (charName, itemName) -> charName.setHealthPoints(charName.getHealthPoints() + itemName.getEffectOnHealth());
            use.accept(character, item);
            System.out.println(item.getItemName() + " used on " + character.toString());
        }
    }
    
}