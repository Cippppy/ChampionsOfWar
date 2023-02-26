import java.util.List;
import java.util.ArrayList;

public class Character 
{

    // The name of the character
    private String name;
    // The HP of the character
    private int healthPoints;
    // The items the character has
    private List<Item> bag = new ArrayList<Item>();

    /**
     * Create a new character with a name and an intial HP
     * 
     * @author Christian Cipolletta
     * @param name The character's name
     * @param healthPoints The number of health points for the character
     */
    public Character(String name, int healthPoints) 
    {
        if(name != null && healthPoints > 0)
        {
            this.name = name;
            this.healthPoints = healthPoints;
        }
        else
        {
            System.out.println("Error: The input name or HP is invalid.");
        }
    }

    /**
     * Set the character's name
     * @param name The character's name
     */
    public void setName(String name) 
    {
        if(name != null)
        {
            this.name = name;
        }
        else
        {
            System.out.println("Error: The input name is invalid.");
        }
    }

    /**
     * Return the character's name
     * @return The character's name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set the character's HP
     * @param healthPoints The character's HP
     */
    public void setHealthPoints(int healthPoints)
    {
        if(healthPoints > 0)
        {
            this.healthPoints = healthPoints;
        }
        else if(healthPoints <= 0)
        {
            this.healthPoints = 0;
        }
        else
        {
            System.out.println("Error: The input HP is invalid.");
        }
    }
    
    /**
     * Return the character's HP
     * @return The character's HP
     */
    public int getHealthPoints()
    {
        return healthPoints;
    }

    /**
     * Set the character's bag
     * @param bag The character's bag
     */
    public void setBag(List<Item> bag)
    {
        if(bag != null)
        {
            this.bag = bag;
        }
        else
        {
            System.out.println("Error: The input is invalid.");
        }
    }

    /**
     * Return the items in the character's bag
     * @return The items in the character's bag
     */
    public List<Item> getBag()
    {
        return bag;
    }

    /**
     * Adds a single item to the character's bag
     * @param item The item to be added to the character's bag
     */
    public void addToBag(Item item)
    {
        if(item != null)
        {
            bag.add(item);
            System.out.println(item.getItemName() + " added to " + toString());
        }
        else
        {
            System.out.println("Error: The input is invalid.");
        }
    }

    public void use(Character character, Item item)
    {
        if(character != null && item != null && bag.indexOf(item) != -1)
        {
            bag.get(bag.indexOf(item)).use(character, item);
        }
        else
        {
            System.out.println("Error the input is invalid.");
        }
    }

    @Override
    public String toString()
    {
        return name + " (" + healthPoints + ")";
    }
}
