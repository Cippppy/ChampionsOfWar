import java.util.function.BiConsumer;

public class Spell extends Item implements Equipable, Removable, Readable
{
    // The magic words of the spell
    private String text;

    /**
     * Create a new spell with a name, an effect on health, and magic words
     * 
     * @param name The name of the spell
     * @param effectOnHealth The effect on the character's health
     * @param text The magic words the character reads
     */
    public Spell (String name, int effectOnHealth, String text)
    {
        super(name, effectOnHealth);
        if(text != null)
        {
            this.text = text;
        }
    }

    /**
     * The character reads the magic words of the spell
     * @param character The character reading the spell
     * @param item The spell to be used
     */
    public void read(Character character, Item item)
    {
        BiConsumer<Character,Item> read = (charName, itemName) -> System.out.println("Reading Spell, '" + text + "'");
        read.accept(character, item);
    }

}
