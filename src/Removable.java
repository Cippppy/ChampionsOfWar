import java.util.function.BiConsumer;

public interface Removable 
{
    public default void remove(Character character, Item item)
    {
        BiConsumer<Character, Item> remove = (charName, itemName) -> charName.setHealthPoints(charName.getHealthPoints() - itemName.getEffectOnHealth());
        remove.accept(character, item);
        System.out.println("removing");
    }
}
