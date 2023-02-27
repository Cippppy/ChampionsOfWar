import java.util.function.BiConsumer;

/**
 * Spell is a sub class of item that is Readable, Equipable, and Removable.
 * 
 * @author Christian Cipolletta
 * @version 2/26/2023
 */
public class Spell extends Item implements Equipable, Removable, Readable
{
    // The magic words of the spell
    private String magicWords;

    /**
     * Create a new spell with a name, an effect on health, and magic words
     * 
     * @param name The name of the spell
     * @param effectOnHealth The effect on the character's health
     * @param magicWords The magic words the character reads
     */
    public Spell (String name, int effectOnHealth, String otherInfo, String magicWords)
    {
        super(name, effectOnHealth, otherInfo);
        if(magicWords != null)
        {
            this.magicWords = magicWords;
        }
        else
        {
            System.out.println("Error: The input is invalid.");
        }
    }

    /**
     * Sets the spell's magic words
     * @param magicWords The spell's magic words
     */
    public void setMagicWords(String magicWords)
    {
        if(magicWords != null)
        {
            this.magicWords = magicWords;
        }
        else
        {
            System.out.println("Error: The input is invalid.");
        }
    }

    /**
     * Return the spell's magic words
     * @return The spell's magic words
     */
    public String getMagicWords()
    {
        return magicWords;
    }

    @Override
    public void equip(Character character, Item item)
    {
        if(character != null && item != null)
        {
            System.out.println("glowing");
        }
        else
        {
            System.out.println("Error: The input is invalid.");
        }
    }

    @Override
    public void remove(Character character, Item item)
    {
        if(character != null && item != null)
        {
            System.out.println("no longer glowing");
        }
        else
        {
            System.out.println("Error: The input is invalid.");
        }
    }

    @Override
    public void read(Character character, Item spell)
    {
        if(character != null && spell != null)
        {
            BiConsumer<Character, Item> read = (charName, spellName) -> System.out.println("Reading Spell, '" + getMagicWords() + "'");
            read.accept(character, spell);
        }
    }

    @Override
    public void use(Character character, Item item)
    {
        super.use(character, item);
        read(character, item);
    }
}
