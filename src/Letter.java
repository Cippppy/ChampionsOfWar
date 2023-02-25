import java.util.function.BiConsumer;

public class Letter extends Item implements Readable
{
    // The text inside the letter
    private String text;

    /**
     * Create a new letter with a name, effect on health, and text
     * 
     * @param name The name of the letter
     * @param effectOnHealth The effect on the character's HP
     * @param text The text within the letter
     */
    public Letter (String name, int effectOnHealth, String text)
    {
        super(name, effectOnHealth);
        if(text != null)
        {
            this.text = text;
        }
    }

    /**
     * The character reads the text within the letter
     * @param character The character doing the reading
     * @param item The letter to be read
     */
    public void read(Character character, Item item)
    {
        if(character != null && item != null)
        {
            BiConsumer<Character,Item> read = (charName, itemName) -> System.out.println("Reading Letter, '" + text + "'");
            read.accept(character, item);
        }
        else
        {
            System.out.println("Error: The input is invalid.");
        }
    }

    @Override
    public void use(Character character, Item item)
    {
        BiConsumer<Character, Item> use = (charName, itemName) -> 
        {
            charName.setHealthPoints(charName.getHealthPoints() + itemName.getEffectOnHealth());
            System.out.println(itemName.getItemName() + " used on " + charName.toString());
            read(charName, itemName);
        };
        use.accept(character, item);
    }
}
