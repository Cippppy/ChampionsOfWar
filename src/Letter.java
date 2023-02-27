import java.util.function.BiConsumer;

/**
 * Letter is a sub class of item that is Readable.
 * 
 * @author Christian Cipolletta
 * @version 2/26/2023
 */
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
    public Letter (String name, int effectOnHealth, String otherInfo, String text)
    {
        super(name, effectOnHealth, otherInfo);
        if(text != null)
        {
            this.text = text;
        }
        else
        {
            System.out.println("Error: The input is invalid.");
        }
    }

    /**
     * Return the text of the letter
     * @return The text of the letter
     */
    public String getText()
    {
        return text;
    }

    /**
     * Set the text of the letter
     * @param text The text to be set
     */
    public void setText(String text)
    {
        this.text = text;
    }

    @Override
    public void read(Character character, Item letter)
    {
        if(character != null && letter != null)
        {
            BiConsumer<Character, Item> read = (charName, letterName) -> System.out.println("Reading Letter, '" + getText() + "'");
            read.accept(character, letter);
        }
    }

    @Override
    public void use(Character character, Item item)
    {
        super.use(character, item);
        read(character, item);
    }
}
