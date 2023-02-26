public interface Equipable
{
    public default void equip(Character character, Item item)
    {
        if(character != null && item != null)
        {
            System.out.println("equipping");
        }
        else
        {
            System.out.println("Error: The input is invalid.");
        }
    }
}