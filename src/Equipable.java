import java.util.function.BiConsumer;

public interface Equipable
{
    public default void equip(Character character, Item item)
    {
        BiConsumer<Character, Item> equip = (charName, itemName) -> charName.setHealthPoints(charName.getHealthPoints() + itemName.getEffectOnHealth());
        equip.accept(character, item);
        System.out.println("equipping");
    }
}