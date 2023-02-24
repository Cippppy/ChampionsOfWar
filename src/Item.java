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

    public String getItemName() 
    {
        return this.itemName;
    }

    public void setEffectOnHealth(int effectOnHealth) 
    {
        this.effectOnHealth = effectOnHealth;
    }

    public int getEffectOnHealth() 
    {
        return this.effectOnHealth;
    }
    
}